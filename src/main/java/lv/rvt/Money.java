package lv.rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (euros < 0 || cents < 0) {
            this.euros = 0;
            this.cents = 0;
            return;
        }


        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        

        if (newCents > 99) {
            newEuros = newEuros + newCents / 100;
            newCents = newCents % 100;
        }
        
        return new Money(newEuros, newCents);
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        
        if (this.euros == compared.euros) {
            return this.cents < compared.cents;
        }
        
        return false;
    }
    
    public Money minus(Money decreaser) {
        int totalThisCents = this.euros * 100 + this.cents;
        int totalDecreaserCents = decreaser.euros * 100 + decreaser.cents;
        
        int difference = totalThisCents - totalDecreaserCents;
        

        if (difference < 0) {
            return new Money(0, 0);
        }
        
        int newEuros = difference / 100;
        int newCents = difference % 100;
        
        return new Money(newEuros, newCents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}