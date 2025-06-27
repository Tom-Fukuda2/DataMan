import java.lang.Math;

class DiceGame {

    void run() {

        int die1, die2, total;

        System.out.println("Rolling dice...");

        die1 = (int) ((Math.random() * 6) + 1);
        System.out.println("Die 1: " + die1);

        die2 = (int) ((Math.random() * 6) + 1);
        System.out.println("Die 2: " + die2);

        total = die1 + die2
        System.out.println("Total value: " + total);

    }

    public static void main(String[] args) {
        new DiceGame().run();
    }
}
