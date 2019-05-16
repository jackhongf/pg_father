#!/bin/bash
cd `dirname $0`
. /etc/profile
. ~/.bash_profile
./stop.sh
./start.sh
