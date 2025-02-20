package lv.rvt;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class PersonManager {
	private ArrayList<Person> personList;
	private static final String FILE_PATH = "/workspaces/java-intro-23DP2DVeli/data/persons.csv";

	public PersonManager() {
		this.personList = loadPersons();
	}

	private ArrayList<Person> loadPersons() {
		ArrayList<Person> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(", ");
				String name = data[0].trim();
				int age = Integer.parseInt(data[1].trim());
				int weight = Integer.parseInt(data[2].trim());
				int height = Integer.parseInt(data[3].trim());
				list.add(new Person(name, age, weight, height));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void addPerson(Person person) {
		personList.add(person);
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_PATH), StandardOpenOption.APPEND)) {
			writer.write(person.toCsvRow());
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Person> getPersonListSortedByName() {
		return personList.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
	}

	public List<Person> getPersonListSortedByAge() {
		return personList.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
	}

	public List<Person> getPersonListSortedByAddress() {
		return personList.stream().sorted(Comparator.comparing(Person::getAdress, Comparator.nullsLast(String::compareTo))).collect(Collectors.toList());
	}

	public void show(List<Person> list) {
        final String RESET = "\u001B[0m";
        final String BLUE = "\u001B[34m";
        final String GREEN = "\u001B[32m";
    
        System.out.printf(BLUE + "| %-15s | %-3s | %-6s | %-6s | %-6s |\n" + RESET,
                "Name", "Age", "Height", "Weight", "BMI");
        System.out.println(BLUE + "|-----------------|-----|--------|--------|------|" + RESET);
    
        for (Person person : list) {
            double bmi = person.getWeight() / Math.pow(person.getHeight() / 100.0, 2);
            System.out.printf(GREEN + "| %-15s | %-3d | %-6d | %-6d | %-6.2f |\n" + RESET,
                    person.getName(), person.getAge(), person.getHeight(), person.getWeight(), bmi);
        }
    }
    

	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Choose sorting option: name, age, address or exit");
			String choice = scanner.nextLine().trim().toLowerCase();
			switch (choice) {
				case "name":
					show(getPersonListSortedByName());
					break;
				case "age":
					show(getPersonListSortedByAge());
					break;
				case "address":
					show(getPersonListSortedByAddress());
					break;
				case "exit":
					return;
				default:
					System.out.println("Invalid option, try again.");
			}
		}
	}
}
