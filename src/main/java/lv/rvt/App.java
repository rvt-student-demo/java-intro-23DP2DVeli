package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi savu vārdu: ");

        String name = scanner.nextLine();

        System.out.println("Ievadi savu uzvārdu: ");
        String lastname = scanner.nextLine();

        System.out.println("Ievadi savu gruppu: ");
        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " + lastname + ", group: " + group);
    }
}

