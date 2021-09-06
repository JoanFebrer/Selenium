FROM alpine:3.5

MAINTAINER Joan Febrer

RUN apk update
RUN apk upgrade
RUN apk add git
RUN git clone https://github.com/JoanFebrer/SeleniumTestCase
