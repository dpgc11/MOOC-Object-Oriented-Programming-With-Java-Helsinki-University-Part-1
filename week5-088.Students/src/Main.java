
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        while (true) {

            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                System.out.println("");
                for (Student str : students) {
                    System.out.println(str);
                    
                }
                System.out.println("");
                break;
            }
            System.out.print("studentnumber: ");
            String number = "" + reader.nextLine();

            students.add(new Student(name, number));

        }
        
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        
        for (Student str : students) {
            if (str.getName().contains(search)) {
                System.out.println(str);
            }
        }

        
    }
}
