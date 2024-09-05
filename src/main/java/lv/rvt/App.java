package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //Mēs gribām uzzinat lietotāja: Vārdu, Uzvārdu, Gruppu

        System.out.print("Ievadi savu Vārdu: ");
        String name = scanner.nextLine();
        System.out.print("Ievadi savu Uzvārdu: ");
        String surname = scanner.nextLine();
        System.out.print("Ieavadi savu Gruppu: ");
        String group = scanner.nextLine();

        System.out.println(name + " " + surname + " " + group);
    }
 
}

