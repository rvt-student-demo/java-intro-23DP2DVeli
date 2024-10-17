package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println("I am thinking of a number from 1 to 10. You must guess what it is in three tries.");
        for (int i = 0; i < 3; i ++) {
            System.out.println("Enter a guess:");
            int x = Integer.valueOf(scanner.nextLine());
            if (x == num) {
                System.out.println("RIGHT!" );
                break;
            
            } else {
                if (i == 2) {
                System.out.println("wrong");
                System.out.println("The correct number was " + num + ". You have lost the game.");
                break;
                }            
            temperature(x, num);
                
            }
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


