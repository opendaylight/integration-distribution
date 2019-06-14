#!/bin/sh
#
# Copyright (c) 2018 Pantheon Technologies, s.r.o. and others.  All rights reserved.
#
# This program and the accompanying materials are made available under the
# terms of the Eclipse Public License v1.0 which accompanies this distribution,
# and is available at http://www.eclipse.org/legal/epl-v10.html
#

#
# This script visits all jars within the OpenDaylight karaf distribution and extracts
# all production YANG modules (as located in META-INF/yang)
#
set -e

# FIXME: make this tuneable
OUTPUT="opendaylight-models"
INPUT="."

# FIXME: also wipe output?
[ -d "$OUTPUT" ] || mkdir "$OUTPUT"

PROJECTS=`ls -d $INPUT/system/org/opendaylight/*`
for proj in $PROJECTS; do
    proj=`basename $proj`
    echo "Extracting modules from $proj"
    JARS=`find $INPUT/system/org/opendaylight/$proj -type f -name '*.jar' | sort -u`
    [ -d "$OUTPUT/$proj" ] || mkdir $OUTPUT/$proj
    for jar in $JARS; do
        unzip -l "$jar" | grep -q -e "\.yang$" &&
        unzip -q "$jar" 'META-INF/yang/*' -d "$OUTPUT/$proj"
    done
    if [ -z "$(ls -A $OUTPUT/$proj)" ]; then
        rm -rf $OUTPUT/$proj
    else
        rm -f $OUTPUT/$proj/*.yang
        YANGS=`find $OUTPUT/$proj/META-INF/yang/ -type f -name '*.yang'`
        for yang in $YANGS; do
            name=`basename $yang`
            less $yang | grep -q namespace.*opendaylight &&
            mv $OUTPUT/$proj/META-INF/yang/$name $OUTPUT/$proj &&
            echo "  $name"
        done
        rm -rf $OUTPUT/$proj/META-INF
    fi
done
