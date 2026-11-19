package inheritence.example7;

public class Doctor extends Employee {

    int category;

    public Doctor(String name, long date, double salary, int category) {
        super(name, date, salary);
        this.category = category;


    }
}
