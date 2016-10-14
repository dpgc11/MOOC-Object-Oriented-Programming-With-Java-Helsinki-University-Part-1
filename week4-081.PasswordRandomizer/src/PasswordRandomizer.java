
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables here
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        // Format the variable here
        random = new Random();
        this.length = length;
    }

    public String createPassword() {
        // Write the code here which returns the new password

        int number;
        char symbol;
        String password = "";
        
        for (int i = 0; i < this.length; i++) {

            number = random.nextInt(26);
            symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password += symbol;

        }
        
        return password;
    }
}
