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
    cd $OUTPUT
    [ -d "$proj" ] || mkdir $proj
    cd - > /dev/null
    for jar in $JARS; do
        artifact=`basename $jar | sed 's/.jar$//'`
        # FIXME: better control over unzip errors
        unzip -q "$jar" 'META-INF/yang/*' -d "$artifact" \
        2>/dev/null || true

        dir="$artifact/META-INF/yang"
        if [ -d "$dir" ]; then
            for file in `find $dir -type f -name '*.yang'`; do
                module=`basename "$file"`
                echo -e "\t$module"
                # FIXME: better duplicate detection
                mv -n "$file" "$OUTPUT/$proj"
            done
        fi

        rm -rf "$artifact"
    done
    pushd $INPUT > /dev/null
    cd $OUTPUT/$proj
    if [ -z "$(ls -A)" ]; then
        cd ..
        rmdir $proj
    fi
    popd > /dev/null
done
