import java.util.Random;

public class Main {
    public static void main(String[] args) {
        playBowling();
    }

    private static void playBowling() {
        BowlingGameKata game = new BowlingGameKata();
        int roll = 1;
        while(game.score() < 280 && roll <= 20) {
            System.out.println("Rolls: " + roll);
            game.roll(randomNumberGenerator());
            roll++;
            if (game.score() == 280) {
                bonusBalls(game);
            }
        }

        System.out.println("Final score: " + game.score());
    }

    private static void bonusBalls(BowlingGameKata game) {
        int pins = randomNumberGenerator();
        if (pins == 10) {
            System.out.println("Bonus roll: 1");
            game.roll(pins);
            System.out.println("Bonus roll: 2");
            game.roll(randomNumberGenerator());
        } else {
            System.out.println("Bonus roll: 1");
            game.roll(pins);
        }
    }

    private static int randomNumberGenerator() {
        System.out.println(new Random().nextInt(11));
        return new Random().nextInt(11);
    }
}