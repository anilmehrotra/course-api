FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG /lib/
COPY artifact /var/lib
run ls -l /var/lib
EXPOSE 9000
ENTRYPOINT ["java","-jar","/var/lib/course-api-0.0.1-SNAPSHOT.jar"]
#CMD java -jar /var/lib/course-api-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["./startContainer.sh"]