package lv.rvt;
import java.util.*;
import java.io.*;
import java.nio.file.StandardOpenOption;

public class App {
    public static void main(String[] args) {
        Timer timer = new Timer(0, 0); 

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}