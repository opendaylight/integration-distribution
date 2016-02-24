#!/usr/bin/python

#
# Copyright (c) 2016 NEC Corporation and others
# All rights reserved.
#
# This program and the accompanying materials are made available under the
# terms of the Eclipse Public License v1.0 which accompanies this
# distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
#

import requests, json


#response code to check the rest calls
RESP_GET_SUCCESS = 200
RESP_NOT_FOUND = 404


controller_headers = {'Accept':'application/json', 'content-type': 'application/json'}

#method to check the cluster status
def validate_cluster(ipaddress):
    url = "http://"+ipaddress+":8181/jolokia/read/akka:type=Cluster"
    try:
       resp = requests.get(url, headers=controller_headers, auth=('admin','admin'))
    except requests.exceptions.RequestException:
       print "controller is unreachable"
       exit(1)
    
    if resp.status_code != RESP_GET_SUCCESS:
       print "jolokia not installed,resp code:", resp.status_code
       exit(1)

    data = json.loads(resp.content)
    clusterStatus = data['value']
    Members = clusterStatus['ClusterStatus']
    status = json.loads(Members)
    memberStatus = status['members']
    memberList = []
    entity_owner_list = []

    for member in memberStatus :
        node = member['address'][member['address'].index('@')+1:member['address'].rindex(':')]
        node_status = node+"-"+member['status']
        memberList.append(node_status)
        url1 = "http://"+node+":8181/jolokia/read/org.opendaylight.controller:Category=ShardManager,name=shard-manager-operational,type=DistributedOperationalDatastore"
        resp1 = requests.get(url1, headers=controller_headers, auth=('admin', 'admin'))
        if resp1.status_code != RESP_GET_SUCCESS:
            print 'error in getting response for the node:', node
            continue
        data2 = json.loads(resp1.content)
        member_role = data2['value']['MemberName']
        entity_owner_list.append(node+":"+member_role)
    leader = data['value']['Leader']

    leaderNode = leader[leader.index('@')+1:leader.rindex(':')]
    for leader_node in memberList:
        address = leader_node.split('-')
        if address[0] == leaderNode:
            print "\n=================== Leader Node ======================\n"
            print leader_node
            memberList.remove(leader_node)
            print "\n=================== Follower Node =====================\n"
            print memberList
    list_entity_owners(ipaddress, entity_owner_list)

#method to list the entity owners
def list_entity_owners(ipaddress, entity_owner_list):
    url = "http://"+ipaddress+":8181/restconf/operational/entity-owners:entity-owners"
    resp = requests.get(url, headers=controller_headers, auth=('admin', 'admin'))
    if resp.status_code != RESP_GET_SUCCESS:
        print "controller is down, resp_code", resp.status_code
        exit(1)
    data = json.loads(resp.content)
    ovsdb = data['entity-owners']['entity-type']
    print "\n\n=================== Entity Details ===================\n"
    for e_type in ovsdb:
        entities = e_type['entity']
        for entity in entities:
            id = entity['id']
            if len(entity['owner']) > 0:
                print "NODE ID = ", id[id.rindex('=')+2:len(id)-2]
                print "OWNER = ", entity['owner']
            for owner in entity_owner_list:
                owner_role = owner.split(':')
                if entity['owner'] == owner_role[1]:
                    print "IP Address = ", owner_role[0] 
                    print "\n"


# Main Block
if __name__ == '__main__':
    print '*****Cluster Status******'
    ipaddress = raw_input("Please enter ipaddress to find Leader Node : ")
    validate_cluster(ipaddress)

else:
    print "Cluster checker loaded as Module"


