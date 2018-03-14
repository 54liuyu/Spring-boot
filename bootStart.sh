#!/bin/bash

nohup /usr/local/jdk1.8.0_102/bin/java -jar /usr/local/program/project/app.jar > /usr/local/program//project/app.log 2>&1  &

proc_name="app.jar"

name_suffixx="\>"

proc_id=`ps -ef|grep -i ${proc_name}${name_suffixx}|grep -v "grep"|awk '{print $2}'`

echo ${proc_name}" pid:"

echo ${proc_id[@]}