package lv.rvt;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int end = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        for (int i = 1; i <= end; i++) {
            factorial *=i;
        }
        
        System.out.println("Factorial is " + factorial);
    }
}




