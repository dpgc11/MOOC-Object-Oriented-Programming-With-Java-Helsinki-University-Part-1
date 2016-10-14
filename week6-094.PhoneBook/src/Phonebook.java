/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> book;

    public Phonebook() {
        book = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.book.add(new Person(name, number));
    }

    public void printAll() {
        for (Person p : this.book) {
            System.out.println(p);
        }
    }

    public String searchNumber(String name) {
        for (Person p : this.book) {
            if (p.getName().equals(name)) {
                return p.getNumber();
            }
        }
        return "number not known";
    }

}
