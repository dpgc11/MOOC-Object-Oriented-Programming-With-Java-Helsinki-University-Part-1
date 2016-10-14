
public class Main {

    public static void main(String[] args) {
        // write test code here
        CashRegister unicafe = new CashRegister();
        
        double theChange = unicafe.payEconomical(10);
        System.out.println("the change was: " + theChange);
        
        LyyraCard cardOfJim = new LyyraCard(7);
        
        boolean succeeded = unicafe.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafe.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafe.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);
        
        System.out.println(unicafe);
    }
}

