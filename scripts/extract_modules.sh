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

JARS=$(find $INPUT/system/org/opendaylight -type f -name '*.jar' | sort -u)

# FIXME: also wipe output?
[ -d "$OUTPUT" ] || mkdir "$OUTPUT"
for jar in $JARS; do
    artifact=$(basename "$jar" | sed 's/.jar$//')
    echo "Extracting modules from $artifact"
    # FIXME: better control over unzip errors
    unzip -q "$jar" 'META-INF/yang/*' -d "$artifact" \
        2>/dev/null || true

    dir="$artifact/META-INF/yang"
    if [ -d "$dir" ]; then
        for file in $(find "$dir" -type f -name '*.yang'); do
            module=$(basename "$file")
            echo -e "\t$module"
            # FIXME: better duplicate detection
            mv -n "$file" "$OUTPUT"
        done
    fi

    rm -rf "$artifact"
done

