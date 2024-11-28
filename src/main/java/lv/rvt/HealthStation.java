package lv.rvt;

public class HealthStation {
    private int weight;
    private int weighings;
    public void Health(Person person) {
        int weight = person.getWeight();
        this.weight = weight;
    }
    public int weigh(Person person) {
        this.weight = person.getWeight();
        weighings++;
        return this.weight;

    }

    public void feed(Person person) {
        this.weight+=1;
        person.setWeight(person.getWeight() + 1);
        
    }

    public int weighings() {
        return weighings;
    }
}
