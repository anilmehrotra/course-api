#!/bin/sh
set -e
exec "java" "-jar" "/var/lib/course-api-0.0.1-SNAPSHOT.jar" "$@"
exec "$@"
