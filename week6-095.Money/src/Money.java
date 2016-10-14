
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int euroSum = this.euros + added.euros;
        int centSum = this.cents + added.cents;

        if (centSum > 99) {
            euroSum += centSum / 100;
            centSum %= 100;
        }

        return new Money(euroSum, centSum);

    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else if (this.euros == compared.euros && this.cents > compared.cents) {
            return false;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decremented) {
        int euro = this.euros - decremented.euros;
        int cent = this.cents - decremented.cents;
        
        if (cent < 0) {
            cent += 100;
            euro--;
            
        }
        if (euro < 0) {
            return new Money(0,0);
        }
        return new Money(euro,cent);
        
    }
}
