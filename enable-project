#!/bin/bash

set -e

if [ $# -lt 1 ]; then
  echo "$0 <project> [<project> ...]"
  echo enables the named projects.
  exit 1
fi

while [ -n "$1" ]; do
  echo -n "Processing $1... "
  for file in $(git grep -l "<id>$1</id>"); do
    xmlstarlet ed -P -N mvn=http://maven.apache.org/POM/4.0.0 \
      -u //mvn:profile[mvn:id=\"$1\"]/mvn:activation/mvn:activeByDefault \
      -v true "${file}" > "${file}.new"
    mv "${file}"{.new,}
  done
  echo done.
  shift
done
