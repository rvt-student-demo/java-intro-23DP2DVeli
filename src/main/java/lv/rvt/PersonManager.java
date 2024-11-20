package lv.rvt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonManager {


    public static ArrayList<Person>getPersonList() {
            ArrayList<Person> personList = new ArrayList<>();
        String csvFile = "/workspaces/java-intro-23DP2DVeli/data/persons.csv"; 
        String line;
        String delimiter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimiter);
                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                int weight = Integer.parseInt(data[2].trim());
				int height = Integer.parseInt(data[3].trim());
                personList.add(new Person(name, age, weight, height));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;
    }
}
