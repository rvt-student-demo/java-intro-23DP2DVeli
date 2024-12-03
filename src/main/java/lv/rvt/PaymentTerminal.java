package lv.rvt;

public class PaymentTerminal {
 
        private double money; 
        private int affordableMeals; 
        private int heartyMeals;  
        private static final double AFFORDABLE_PRICE = 2.5;
        private static final double HEARTY_PRICE = 4.3;
     
        public PaymentTerminal() {
            this.money = 1000.0;
            affordableMeals = 0;
            heartyMeals = 0;
        }
     
        public double eatAffordably(double payment) {

            if (payment >= 2.5) {
                this.money = this.money + 2.5;
                payment = payment - 2.5;
                affordableMeals++;
            }
            return payment;
        }
     
        public boolean eatAffordably(PaymentCard card) {
            if (card.balance() >= 2.5) {
                card.takeMoney(2.5);
                affordableMeals++;
                return true;
            } else {
                return false;
            }
        }
     
        public double eatHeartily(double payment) {

            if (payment >= 4.3) {
                this.money = this.money + 4.3;
                payment = payment - 4.3;
                heartyMeals++;
            }
            return payment;
        }
     
        public boolean eatHeartily(PaymentCard card) {
            if (card.balance() >= 4.3) {
                card.takeMoney(4.3);
                heartyMeals++;
                return true;
            } else {
                return false;
            }
        }
     
        public void addMoneyToCard(PaymentCard card, double sum) {
            if (sum > 0) { 
                card.addMoney(sum);
                this.money += sum; 
            }
        }
     
        @Override
        public String toString() {
            return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
        }
    }

