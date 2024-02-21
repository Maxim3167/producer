FROM openjdk:latest
LABEL authors="Maxim Kabanov"
COPY build/libs/producer_kafka-1.0-SNAPSHOT.jar /
RUN chmod +x producer_kafka-1.0-SNAPSHOT.jar
CMD ["java","-jar","producer_kafka-1.0-SNAPSHOT.jar"]