#!/bin/sh
mvn clean package && docker build -t net.hapl.aptu/APTU .
docker rm -f APTU || true && docker run -d -p 9080:9080 -p 9443:9443 --name APTU net.hapl.aptu/APTU