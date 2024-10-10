package lv.rvt;

import java.util.*;




public class Stars {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
        System.out.print('*');
        }
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }   
    
    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++){
            printStars(i);
            System.out.println();
        }
    
    }

    public static void printRightTriangle(int size) {
        for (int j = 1; j < size + 1; j++){
                printSpace(size-j);
                printStars(j);
            System.out.println();
        }
    }
    

    public static void printSpace(int number) {
        for (int i = 0; i < number; i++) {
        System.out.print(' ');
        }
    }    
    
}

