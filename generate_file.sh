#!/bin/bash

if [ "$#" -ne 2 ]; then
    echo "Error: Exactly two arguments are required."
    echo "Usage: $0 <relative_path_1> <relative_path_2>"
    exit 1
fi

inPath="$1"
outPath="$2"

# Check if realpath command exists
if ! command -v realpath >/dev/null 2>&1; then
    echo "Error: 'realpath' command not found. Please install it."
    exit 1
fi

if [ ! -e "$inPath" ]; then
    echo "Error: Path '$inPath' does not exist."
    exit 1
fi

if [ ! -e "$outPath" ]; then
    echo "Error: Path '$outPath' does not exist."
    exit 1
fi

absoluteInPath=$(realpath "$inPath")
absoluteOutPath=$(realpath "$outPath")

cd ./it.unibo.sensor.dsl.parent/

./gradlew :it.unibo.sensor.dsl:run --quiet --args "$absoluteInPath $absoluteOutPath"
