FROM openjdk:latest

WORKDIR /app

COPY MultiplicationTable.java /app/

RUN javac MultiplicationTable.java

CMD ["java", "MultiplicationTable"]
