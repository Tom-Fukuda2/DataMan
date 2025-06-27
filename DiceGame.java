import java.util.Scanner;
import java.lang.Math;

class DiceGame {

    void run() {

        int die1, die2, total;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        System.out.print("> ");

        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

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
