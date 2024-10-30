package lv.rvt;

public class Persone {
    private String name;
    private int age;
    
    public Persone(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
    
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
