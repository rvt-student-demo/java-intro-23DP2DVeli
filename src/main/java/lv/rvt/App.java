package lv.rvt;
import java.util.*;
public class App 
{
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");

        bond.toString();
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }

}