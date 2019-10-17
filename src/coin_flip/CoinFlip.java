package coin_flip;

import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args) {
        Coin coin = new Coin(250);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Coin Flip!\nType heads or tails!\nType q to quit.");

        while (true) {
            System.out.print(">");
            String input = sc.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            coin.airTime();
            String outcome = coin.flip();
            System.out.println("\n" + coin.toString());
            if (input.equalsIgnoreCase(outcome)) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }
        }
        System.out.println("Thanks for playing!");
    }
}
