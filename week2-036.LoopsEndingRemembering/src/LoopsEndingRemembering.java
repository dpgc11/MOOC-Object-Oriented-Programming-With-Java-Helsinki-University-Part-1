
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int sum = 0;
        int numOfNumbers = 0;
        double average = 0;
        int numOfEven = 0;
        int numOfOdd = 0;

        while (true) {

            int num = reader.nextInt();

            if (num == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }

            if (num % 2 == 0) {

                numOfEven++;
            } else {

                numOfOdd++;
            }

            numOfNumbers++;
            sum += num;

        }
        average = (1.0 * sum / numOfNumbers);
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + numOfEven);
        System.out.println("Odd numbers: " + numOfOdd);

    }

}
