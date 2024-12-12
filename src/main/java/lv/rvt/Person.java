package lv.rvt;

public class Person {
	private String name;
	private int age;
	private int weight;
	private int height;
	private SimpleDate date;

	public Person(String name, int age,  int height, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		
	}

	public Person(String name, SimpleDate date , int height, int weight) 
    {
        this.name = name;
        this.date = date;
        this.weight = weight;
        this.height = height;
    }
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getHeight() {
		return this.height;
	}


	public void setWeight(int newweight) {
		this.weight = newweight;
	}

	public double calculateBMI() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

	public boolean equals(Object compared) 
    {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;
        return (this.name.equals(comparedPerson.name) &&
        this.date.getDay() == comparedPerson.date.getDay() &&
        this.date.getMonth() == comparedPerson.date.getMonth() &&
        this.date.getYear() == comparedPerson.date.getYear() &&
        this.weight == comparedPerson.weight &&
        this.height == comparedPerson.height) ;
    }

	
	

	@Override
	public String toString() {
		return String.format(" %s, Age: %d, Weight: %d, Height: %d", name, age, weight, height);
	}
	public String toCsvRow() {
		return String.format("%s,%d,%d,%d", name, age, weight, height);
	}
}
