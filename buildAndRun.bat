@echo off
call mvn clean package
call docker build -t net.hapl.aptu/APTU .
call docker rm -f APTU
call docker run -d -p 9080:9080 -p 9443:9443 --name APTU net.hapl.aptu/APTU