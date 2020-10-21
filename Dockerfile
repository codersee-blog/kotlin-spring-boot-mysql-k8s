FROM openjdk
WORKDIR /work
COPY ./build/libs/k8s-mysql-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/work/app.jar"]