#!/usr/bin/env bash

ansible-playbook "$PATH_RUN/init.playbook.yml" --e "path_source=$PATH_SOURCE path_run=$PATH_RUN db_password=$DB_PASSWORD"