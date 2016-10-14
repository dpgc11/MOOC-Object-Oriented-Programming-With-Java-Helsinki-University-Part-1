
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int guesses = 0;

        while (true) {

            if (numberDrawn < num) {
                guesses++;
                System.out.println("The number is lesser,guesses made: " + guesses);
                System.out.println("Guess a number: ");
                num = Integer.parseInt(reader.nextLine());

            } else if (numberDrawn > num) {
                guesses++;
                System.out.println("The number is greater,guesses made: " + guesses);
                System.out.println("Guess a number: ");
                num = Integer.parseInt(reader.nextLine());

            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
