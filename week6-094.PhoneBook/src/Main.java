
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Phonebook phonebook = new Phonebook();

        phonebook.add("Yogesh", "9916675869");
        phonebook.add("Appa", "9179567756");
        phonebook.add("Mummy", "9179254190");

        String number = phonebook.searchNumber("Yogesh");
        System.out.println(number);
        
        number = phonebook.searchNumber("Abhishek");
        System.out.println(number);

    }
}
