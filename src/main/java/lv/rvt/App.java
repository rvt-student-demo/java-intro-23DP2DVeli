package lv.rvt;
import java.util.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Statistics sum = new Statistics();
        Statistics odd = new Statistics();
        Statistics even = new Statistics();
        System.out.println("Enter numbers:");

        while (true) {
            try {
                int input = Integer.valueOf(scanner.nextLine());
                if (input == -1) {
                    break;
                }
                if (input % 2 == 0) {
                    even.addNumber(input);
                } else {
                    odd.addNumber(input);
                }
                sum.addNumber(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
