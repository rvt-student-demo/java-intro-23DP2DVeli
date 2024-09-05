package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Chicken: ");
        String chicken = scanner.nextLine();
        System.out.print("Bacon (kg): ");
        String bacon = scanner.nextLine();
        System.out.print("Tractor: ");
        String group = scanner.nextLine();

        System.out.println("And finally, a summary:");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(group);
    }
 
}

