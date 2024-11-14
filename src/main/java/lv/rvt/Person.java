package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName, int age, int weight, int height) {
        this.age = age;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0; // Corrected typo here
        return this.weight / (heightPerHundred * heightPerHundred);
    }
}