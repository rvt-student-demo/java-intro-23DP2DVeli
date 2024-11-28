package lv.rvt;

public class HealthStation {
    private int weight;
    public void Health(Person person) {
        int weight = person.getWeight();
        this.weight = weight;
    }
    public int weigh(Person person) {
        this.weight = person.getWeight();
        return this.weight;
    }

    public void feed(Person person) {
        this.weight+=1;
        person.setWeight(person.getWeight() + 1);
        
    }
}
