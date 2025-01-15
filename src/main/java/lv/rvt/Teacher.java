package lv.rvt;

public class Teacher extends Person{
    private int salary;


    public Teacher(String name, String adress, Integer salary) {
        super(name, adress);
        this.salary = salary;
    }


    public int salary(){
        return salary;
    }



    @Override
	public String toString() {
		return String.format("%s \n	%s,\n        salary: %d euro/month", getName(), getAdress(), salary);
	}

}
