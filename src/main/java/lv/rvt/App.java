package lv.rvt;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give numbers: ");
        int sum = 0;
        int numbers = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (input < 0) {
                count++;
                continue;
            } 
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += input;
            numbers++;
            count++;      
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (1.0 * sum / count));   
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}




