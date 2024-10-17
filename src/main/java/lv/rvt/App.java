package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);

        int attempt = 5;

        System.out.println("I am thinking of a number from 1 to 10. You must guess what it is in three tries.");
        while (true) {
            System.out.println("Enter a guess:");
            int x = Integer.valueOf(scanner.nextLine());
            if (attempt == 1){
                System.out.println("You lost.");
                break;
            }


            if (x == num){
                System.out.println("You WON the game!");
                System.out.println("Your score is " + attempt);
                break;
            }
            else{
                diff(x, num);
                attempt--;
                System.out.println("Your score is: " + attempt);
            }

        }
    }

    public static void diff(int x, int num){
            if (x < num) {
                System.out.println("Too low.");
            } else if (x > num){
                System.out.println("Too high");
            }

            
        }


    public static void temperature(int x, int num){
            if (x == num-3 || x == num+3) {
                System.out.println("cold");
            }
            else if (x == num-2 || x == num+2) {
                System.out.println("warm");
            }
            else if (x == num-1 || x == num+1)
                System.out.println("hot");


            
            

            
        }
        
    
    }


