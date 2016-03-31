#!/bin/bash
#
# Copyright (c) 2015 Brocade Communications Systems, Inc. and others.  All rights reserved.
#
# This program and the accompanying materials are made available under the
# terms of the Eclipse Public License v1.0 which accompanies this distribution,
# and is available at http://www.eclipse.org/legal/epl-v10.html
#

# This script is used to disable controller persistence.


function end_banner
{
cat <<EOF
################################################
##   NOTE: Manually restart controller to     ##
##         apply configuration.               ##
################################################
EOF
}


function modify_conf_file
{
    echo "disabling persistence"
    sed -i -e "s/#persistent=true/persistent=false/" ${CLUSTERCONF}
}


function verify_configuration_file
{
    # Constants
    BIN_DIR=`dirname $0`
    test ${BIN_DIR} == '.' && BIN_DIR=${PWD}
    CONTROLLER_DIR=`dirname ${BIN_DIR}`
    CONF_DIR=${CONTROLLER_DIR}/etc
    CLUSTERCONF=${CONF_DIR}/org.opendaylight.controller.cluster.datastore.cfg

    # Verify configuration files are present in expected location.
    if [ ! -f ${CLUSTERCONF} ]; then
        # Check if the configuration files exist in the system
        # directory, then copy them over.
        ORIG_CONF_DIR=${CONTROLLER_DIR}/system/org/opendaylight/controller/sal-clustering-config
        version=$(sed -n -e 's/.*<version>\(.*\)<\/version>/\1/p' ${ORIG_CONF_DIR}/maven-metadata-local.xml)
        ORIG_CONF_DIR=${ORIG_CONF_DIR}/${version}
        ORIG_CLUSTER_CONF=sal-clustering-config-${version}-datastore.cfg

        if [ -f ${ORIG_CONF_DIR}/${ORIG_CLUSTER_CONF} ]; then
            cat <<EOF
 NOTE: Cluster configuration file not found. Copying from
 ${ORIG_CONF_DIR}
EOF
            cp ${ORIG_CONF_DIR}/${ORIG_CLUSTER_CONF} ${CLUSTERCONF}

        else
            cat << EOF
 ERROR: Cluster configuration file not found.
EOF
            exit -1
        fi
    fi
}

function main
{
    verify_configuration_file
    modify_conf_file
    end_banner
}

main $*

# vim: ts=4 sw=4 sts=4 et ft=sh :

