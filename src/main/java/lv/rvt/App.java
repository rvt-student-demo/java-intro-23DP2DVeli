package lv.rvt;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                total += number;
                count++;
            }
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + total);
    }
}




