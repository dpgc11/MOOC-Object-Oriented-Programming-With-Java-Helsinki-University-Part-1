
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Input a temperature: ");
            double temp = Double.parseDouble(reader.nextLine());
            if (temp >= -30 && temp <= 40) {// Graph is used as follows:
                Graph.addNumber(temp);
                // Remove or comment out these lines above before trying to run the tests.
            }
        }
    }
}
