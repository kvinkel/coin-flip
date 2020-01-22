FROM openjdk:8-alpine
COPY ./src/coin_flip /usr/src/coin_flip/
WORKDIR /usr/src/
RUN javac ./coin_flip/*.java
CMD ["java", "coin_flip.CoinFlip"]
