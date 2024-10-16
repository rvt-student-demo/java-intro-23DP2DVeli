package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }
        if (numbers.size() < 3) {
            System.out.println("Not enough numbers in the list");
        } else {
            int sum = numbers.get(1) + numbers.get(2);
            System.out.println(sum);
        }
        if (numbers.size() < 3) {
            System.out.println("Not enough numbers in the list");
        } else {
            int summa_array = 0;
            for (int i = 0; i < numbers.size(); i++) {
                summa_array += numbers.get(i);
            }
            System.out.println(summa_array);
        }
    }
}