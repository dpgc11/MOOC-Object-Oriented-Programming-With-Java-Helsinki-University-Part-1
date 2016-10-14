
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String usr1 = reader.nextLine();
        System.out.println("Type your password: ");
        String pwd1 = reader.nextLine();

        if (usr1.equals("alex")) {
            if (pwd1.equals("mightyducks")) {
                System.out.println("You are now logged into the system!");
            } else {
                System.out.println("Your username or password was invalid!");
            }
        }

        else if (usr1.equals("emily")) {
            if (pwd1.equals("cat")) {
                System.out.println("You are now logged into the system!");
            } else {
                System.out.println("Your username or password was invalid!");
            }

        }
        
        else {
            System.out.println("Your username or password as invalid!");
        }

        
    }
}
