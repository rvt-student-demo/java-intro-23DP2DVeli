package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersonManager {
    

    public static void addPerson(Person person) {
        String csvFile = "/workspaces/java-intro-23DP2DVeli/data/persons.csv"; 
        String delimiter = ", ";
        String personData = person.getName() + delimiter 
                        + person.getAge() + delimiter 
                        + person.getWeight() + delimiter 
                        + person.getHeight();

    try (FileWriter fw = new FileWriter(csvFile, true); 
         BufferedWriter bw = new BufferedWriter(fw)) {
        bw.write(personData);
        bw.newLine();
        bw.flush(); 
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    


    public static ArrayList<Person>getPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        String csvFile = "/workspaces/java-intro-23DP2DVeli/data/persons.csv"; 
        String line;
        String delimiter = ", ";  
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimiter);  
                if (data.length == 4) {  
                    try {
                        String name = data[0].trim();
                        int age = Integer.parseInt(data[1].trim());
                        int weight = Integer.parseInt(data[2].trim());
                        int height = Integer.parseInt(data[3].trim());
                        personList.add(new Person(name, age, weight, height));
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing line (invalid number format): " + line);
                    }
                } else {
                    System.err.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }


}
