package lv.rvt;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.valueOf(scanner.nextLine());

        for (int num = x; num <= 100; num++) {
            System.out.println(num);
}
    }
}




