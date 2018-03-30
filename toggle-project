#!/bin/bash

set -e

if [ $# -lt 1 ]; then
  echo "$0 <project> [<project> ...]"
  echo toggles the activation of the named projects.
  exit 1
fi

while [ -n "$1" ]; do
  echo -n "Processing $1... "
  for file in $(git grep -l "<id>$1</id>"); do
    xmlstarlet ed -P -N mvn=http://maven.apache.org/POM/4.0.0 \
      -u //mvn:profile[mvn:id=\"$1\"]/mvn:activation[mvn:activeByDefault=\"true\"]/mvn:activeByDefault \
      -v wastrue "${file}" > "${file}.1"
    xmlstarlet ed -P -N mvn=http://maven.apache.org/POM/4.0.0 \
      -u //mvn:profile[mvn:id=\"$1\"]/mvn:activation[mvn:activeByDefault=\"false\"]/mvn:activeByDefault \
      -v true "${file}.1" > "${file}.2"
    xmlstarlet ed -P -N mvn=http://maven.apache.org/POM/4.0.0 \
      -u //mvn:profile[mvn:id=\"$1\"]/mvn:activation[mvn:activeByDefault=\"wastrue\"]/mvn:activeByDefault \
      -v false "${file}.2" > "${file}"
    rm -f "${file}".{1,2}
  done
  echo done.
  shift
done
