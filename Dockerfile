FROM openjdk:12
COPY ./src/coin_flip /usr/src/coin_flip/
WORKDIR /usr/src/
RUN javac ./coin_flip/*.java
CMD ["java", "coin_flip.CoinFlip"]
