FROM openjdk:8-jdk-alpine
COPY artifact /var/lib
run ls -l /var/lib
COPY ./startContainer.sh /var/lib
run chmod 766 /var/lib/startContainer.sh
run ls -la /var/lib
ENTRYPOINT ["./var/lib/startContainer.sh"]
#ENTRYPOINT ["java","-jar","/var/lib/course-api-0.0.1-SNAPSHOT.jar"]
#CMD java -jar /var/lib/course-api-0.0.1-SNAPSHOT.jar