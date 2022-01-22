#!/usr/bin/env bash
mvnd clean package install -DskipTests=true -Dmaven.javadoc.skip=true -Dmaven.source.skip=true -Dmaven.compile.fork=true -T 1C
