package lv.rvt;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = Integer.valueOf(scanner.nextLine()); 
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            } 
            
            if (number ==  0) {
                break;
            }
            
    
            if (number > 0) {
                number = number * number;
                System.out.println(number);
                continue;
            }
            
        }
    }
}




