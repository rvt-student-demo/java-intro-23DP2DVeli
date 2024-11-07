package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        // Round the balance to 1 decimal place for better display
        return String.format("The card has a balance of " + this.balance + " euros");
    }

    public void eatAffordably() {
        if (this.balance - 2.60 > 0) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 > 0) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (this.balance + amount <= 150) {
            this.balance += amount;
        } else {
            this.balance = 150;
        }
    }
}