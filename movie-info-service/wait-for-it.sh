#!/usr/bin/env bash
set -e

host="$1"
shift
cmd="$@"

until nc -z "$host"; do
  echo "Waiting for $host to be ready..."
  sleep 10
done

echo "$host is up - executing command"
exec $cmd
