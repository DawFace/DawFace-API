#!/bin/sh

find src -name "*.java" -exec java -jar google-java-format-1.19.2-all-deps.jar --replace {} \;