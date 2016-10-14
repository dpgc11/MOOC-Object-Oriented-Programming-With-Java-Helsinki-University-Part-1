public class Main {
    public static void main(String[] args) {
        Counter count = new Counter(1);
        count.decrease();
        System.out.println(count.value());
        count.decrease();

        System.out.println(count.value());// write testcode here
    }
}
