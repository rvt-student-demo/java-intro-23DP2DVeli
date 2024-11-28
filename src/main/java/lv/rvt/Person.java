package lv.rvt;

public class Person {
	private String name;
	private int age;
	private int weight;
	private int height;

	public Person(String name, int age,  int height, int weight) {
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return String.format(" %s, Age: %d, Weight: %d, Height: %d", name, age, weight, height);
	}
	public String toCsvRow() {
		return String.format("%s,%d,%d,%d", name, age, weight, height);
	}
}
