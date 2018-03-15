#!/bin/bash

netstat -nlp | grep :80 |grep -v grep
if [ $? -eq 0 ]
then
echo 'kill -9 ' $(netstat -nlp | grep :80 | awk '{print $7}' | awk -F"/" '{print $1}')
kill -9 $(netstat -nlp | grep :80 | awk '{print $7}' | awk -F"/" '{print $1}')
else
echo 'not start!'
fi