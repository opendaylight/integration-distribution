#!/bin/bash
#
# Copyright (c) 2015 Brocade Communications Systems, Inc. and others.  All rights reserved.
#
# This program and the accompanying materials are made available under the
# terms of the Eclipse Public License v1.0 which accompanies this distribution,
# and is available at http://www.eclipse.org/legal/epl-v10.html
#


function usage()
{
    # Print any error messages
    test "$1" != "" && echo " ERROR: $1"

    # Print standard usage help
    cat << EOF
 This script is used to configure cluster parameters on this
 controller. The user should restart controller to apply changes.

 Usage: $0 <index> <seed_nodes_list>
  - index: Integer within 1..N, where N is the number of seed nodes.
  - seed_nodes_list: List of seed nodes, separated by comma or space.

 The address at the provided index should belong this controller.
 When running this script on multiple seed nodes, keep the
 seed_node_list same, and vary the index from 1 through N.

EOF

    exit -1
}


function start_banner
{
cat <<EOF
################################################
##             Configure Cluster              ##
################################################
EOF
}

function end_banner
{
cat <<EOF
################################################
##   NOTE: Manually restart controller to     ##
##         apply configuration.               ##
################################################
EOF
}

# Utility function for joining strings.
function join {
    delim=',\n\t\t\t'
    final=$1; shift

    for str in $* ; do
	final=${final}${delim}${str}
    done

    echo ${final}
}

function create_strings
{
    # Using a list of controller IPs, create the strings for data
    # and rpc seed nodes, as well as the list of members.

    # First create an arrays with one string per controller.
    # Then merge the array using the join utility defined above.
    count=1
    for ip in ${CONTROLLERIPS[@]} ; do
        ds[$count]=\\\"akka.tcp:\\/\\/opendaylight-cluster-data@${ip}:2550\\\"
        rpc[$count]=\\\"akka.tcp:\\/\\/odl-cluster-rpc@${ip}:2551\\\"
        members[$count]=\\\"member-${count}\\\"
        count=$[count + 1]
    done

    DATA_SEED_LIST=$(join ${ds[@]})
    RPC_SEED_LIST=$(join ${rpc[@]})
    MEMBER_NAME_LIST=$(join ${members[@]})
}

function get_cli_params
{
    # Check if params have been supplied
    test $# -eq 0 && usage

    # First param is index, and rest are controller list
    INDEX=$1; shift
    CONTROLLER_LIST=$*

    # Verify we have controller list
    test "${CONTROLLER_LIST}" == "" && usage "Missing controller list"

    # Create the list of controllers from the CONTROLLER_LIST variable
    CONTROLLERIPS=( ${CONTROLLER_LIST//,/ } )

    test ${INDEX} -le 0 -o ${INDEX} -gt ${#CONTROLLERIPS[@]} && \
        usage "Invalid index"

    CONTROLLER_ID="member-${INDEX}"
    CONTROLLER_IP="${CONTROLLERIPS[((${INDEX} - 1))]}"
}


function modify_conf_files
{
    echo "Configuring unique name in akka.conf"
    sed -i -e "/roles[ ]*=/ { :loop1 /.*\]/ b done1; N; b loop1; :done1 s/roles.*\]/roles = [\"${CONTROLLER_ID}\"]/}" ${AKKACONF}

    echo "Configuring hostname in akka.conf"
    sed -i -e "s/hostname[ ]*=.*\"/hostname = \"${CONTROLLER_IP}\"/" ${AKKACONF}

    echo "Configuring data and rpc seed nodes in akka.conf"
    sed -i -e "/seed-nodes[ ]*=/ { :loop2 /.*\]/ b done2; N; b loop2; :done2 s/seed-nodes.*opendaylight-cluster-data.*\]/seed-nodes = [${DATA_SEED_LIST}]/; s/seed-nodes.*odl-cluster-rpc.*\]/seed-nodes = [${RPC_SEED_LIST}]/}" ${AKKACONF}

    echo "Configuring replication type in module-shards.conf"
    sed -i -e "/^[^#].*replicas[ ]*=/ { :loop /.*\]/ b done; N; b loop; :done s/replicas.*\]/replicas = [${MEMBER_NAME_LIST}]/}" ${MODULESHARDSCONF}
}


function verify_configuration_files
{
    # Constants
    BIN_DIR=`dirname $0`
    CONTROLLER_DIR=`dirname ${BIN_DIR}`
    CONF_DIR=${CONTROLLER_DIR}/configuration/initial
    AKKACONF=${CONF_DIR}/akka.conf
    MODULESCONF=${CONF_DIR}/modules.conf
    MODULESHARDSCONF=${CONF_DIR}/module-shards.conf

    # Verify configuation files are present.
    if [ ! -f ${AKKACONF} -o ! -f ${MODULESHARDSCONF} ]; then
	cat << EOF
 ERROR: Cluster configurations files not found. Please configure\
 clustering feature.

EOF
	exit -1
    fi
}

function main
{
    get_cli_params $*
    verify_configuration_files
    create_strings

    start_banner
    modify_conf_files
    end_banner
}

main $*

# vim: ts=4 sw=4 sts=4 et ft=sh :

