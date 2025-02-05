package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance = 0;


    public Warehouse(double capacity){
        this.balance = 0;
        this.capacity = capacity;
    }

    

    public double getCapacity(){
        return this.capacity - this.balance;
    }





    public void addToWarehouse(double amount){
        if (capacity >= amount) {
            capacity -= amount;
            balance += amount;
        } else {
            System.out.println("Not enough space for item");
        }
    }


    public void takeFromWarehouse(double amount){
        if (capacity <= amount) {
            capacity += amount;
            balance -= amount;
        } else {
            System.out.println("Not enough ITEMS");
        }
    }


    public void setName(String newName){

    }

    @Override
    public String toString(){
        
        return "balance " + balance + " space left " + capacity;
    }
}
