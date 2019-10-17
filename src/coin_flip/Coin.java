package coin_flip;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Coin {
    private SideUp sideUp;
    private long flipSpeed;
    private Random random;

    public Coin(long flipSpeed) {
        this.flipSpeed = flipSpeed;
        this.random = new Random();
    }

    public void airTime() {
        char[] coinArr = {'-', '\\', '|', '/'};
        int charIndex = 0;
        try {
            for (int i = 0; i < 16; i++) {
                System.out.print("\r" + coinArr[charIndex]);
                charIndex = (charIndex + 1) % coinArr.length;
                TimeUnit.MILLISECONDS.sleep(flipSpeed);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String flip() {
        int randomInt = random.nextInt(100);
        if (randomInt <= 49) {
            sideUp = SideUp.HEADS;
        } else if (randomInt <= 98) {
            sideUp = SideUp.TAILS;
        } else {
            sideUp = SideUp.SIDE;
        }
        return sideUp.toString();
    }

    @Override
    public String toString() {
        if (sideUp.equals(SideUp.HEADS)) {
            return "  .-\"\"\"-.\n" +
                    "//       \\\\\n" +
                    "|| HEADS ||\n" +
                    "\\\\       //\n" +
                    "  '-...-' ";
        } else if (sideUp.equals(SideUp.TAILS)) {
            return "  .-\"\"\"-.\n" +
                    "//       \\\\\n" +
                    "|| TAILS ||\n" +
                    "\\\\       //\n" +
                    "  '-...-' ";
        } else {
            return " _\n" +
                    "| |\n" +
                    "| |\n" +
                    "| |\n" +
                    "| |\n" +
                    "| |\n" +
                    "|_|";
        }
    }
}
