package Exercises;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guess_num {


    public static void main(String[] args) {
        int randomInt = ThreadLocalRandom.current().nextInt(1, 100);
        Scanner user = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Guess the number");
            guess = user.nextInt();
            if (guess < randomInt) {
                System.out.println("The number is greater");
            } else if (guess > randomInt) {
                System.out.println("The number is smaller");
            }
        }
        while (guess != randomInt);

        System.out.println("you guessed the number!");


    }
}