FROM ubuntu:latest
MAINTAINER testuser@test.com

RUN	apt-get update

COPY build/selenium3.jar /
