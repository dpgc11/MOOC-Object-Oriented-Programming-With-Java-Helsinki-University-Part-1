
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        double priceOfEconomical = 2.50;
        if (cashGiven >= priceOfEconomical) {
            this.cashInRegister += priceOfEconomical;
            this.economicalSold += 1;
            return (cashGiven - priceOfEconomical);
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double priceOfGourmet = 4.0;
        if (cashGiven >= priceOfGourmet) {
            this.cashInRegister += priceOfGourmet;
            this.gourmetSold += 1;
            return (cashGiven - priceOfGourmet);
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        double priceOfEconomical = 2.5;
        if (card.balance() >= priceOfEconomical) {

            this.economicalSold += 1;
            card.pay(priceOfEconomical);
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        double priceOfGourmet = 4.0;
        if (card.balance() >= priceOfGourmet) {
            this.gourmetSold += 1;
            card.pay(priceOfGourmet);
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double amount) {
        if (amount > 0) {
            card.loadMoney(amount);
            this.cashInRegister += amount;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
