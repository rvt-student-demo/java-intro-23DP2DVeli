package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Value 1: ");
        int value1 = Integer.valueOf(scanner.nextLine());
        if (value1 < 0) {
            int result = value1 * (-1);
            System.out.println(result);
        } else {
            System.out.println(value1);
        }
    }
}




