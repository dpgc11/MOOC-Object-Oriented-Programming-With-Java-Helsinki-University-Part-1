public class Main {
  public static void main(String[] args) {
    // write test code here
    Person pekka = new Person("Pekka", 15, 2, 1993);
    Person yogesh = new Person("Yogesh",1,9,1991);
    
      System.out.println(pekka.getName() + " is older than " + yogesh.getName() + ": " + pekka.olderThan(yogesh));
      System.out.println(yogesh.getName() + " is older than " + pekka.getName() + ": " + yogesh.olderThan(pekka));
  }
}