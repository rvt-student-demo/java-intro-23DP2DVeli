package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Value 1: ");
        int value1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Value 2: ");
        int value2 = Integer.valueOf(scanner.nextLine());
        double result = Math.sqrt((value1 + value2));
        System.out.println(result);

    }
}




