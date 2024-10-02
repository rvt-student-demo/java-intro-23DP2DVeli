package lv.rvt;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        printUntilNumber(5);
        
    }

    public static void printUntilNumber(int numOfTimes) {
        int i = 1;
        while (i <= numOfTimes) {
            System.out.println(i++); 
    }
}
}




