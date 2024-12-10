package lv.rvt;

import java.util.*;
import java.io.*;
import java.nio.file.StandardOpenOption;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isProgramRunning = true; 
        System.out.println("Welcome to person manager, type \"help\" to see available commands.");
        
        while (isProgramRunning) {
            String command = scanner.nextLine();

            if (command.equals("exit")) { 
                System.out.println("Thanks, bye bye!"); 
                isProgramRunning = false;
                    
            } else if (command.equals("add")) {
                String[] details = scanner.nextLine().split(", ");
                String name = details[0].trim();
                int age = Integer.parseInt(details[1].trim());
                int weight = Integer.parseInt(details[2].trim());
                int height = Integer.parseInt(details[3].trim());
                
                Person newPerson = new Person(name, age, weight, height);
                PersonManager.addPerson(newPerson);
                System.out.println("Person added successfully!");
                
            } else if (command.equals("show")) {
                System.out.println("List of persons:");
                
                // Header
                System.out.printf("| %-20s | %-5s | %-7s | %-7s | %-8s |\n", "Name", "Age", "Weight", "Height", "BMI");
                System.out.println("|----------------------|-------|---------|---------|----------|");
                
                // Print the list
                PersonManager.getPersonList().forEach(person -> {
                    System.out.printf("| %-20s | %-5d | %-7d | %-7d | %-8.2f |\n",
                            person.getName(), person.getAge(), person.getWeight(), person.getHeight(), person.calculateBMI());
                });
                
                System.out.println("|----------------------|-------|---------|---------|----------|");
            } else if (command.equals("help")) {
                System.out.println("Available commands:");
                System.out.println("  show - Display all persons from the CSV file.");
                System.out.println("  add - Add a new person to the CSV file.");
                System.out.println("  help - Show this help menu.");
                System.out.println("  exit - Exit the program.");
            }
            
            System.out.println("Your command was " + command);
        }
    }
}
