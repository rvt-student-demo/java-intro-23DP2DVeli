package lv.rvt;

import java.util.ArrayList;

public class Person {
	private String name;
	private String adress;
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
	
	public Person(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	public String getAdress() {
		return adress;
	}
	
	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return String.format(" %s \n	%s,", name, adress);
	}

}
