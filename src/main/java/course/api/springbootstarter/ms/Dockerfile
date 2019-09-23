FROM openjdk:8-jdk-alpine
COPY artifactTopic /var/lib
run ls -la /var/lib
COPY ./startContainer.sh /var/lib
run chmod 766 /var/lib/startContainer.sh
run ls -la /var/lib
ENTRYPOINT ["./var/lib/startContainer.sh"]


