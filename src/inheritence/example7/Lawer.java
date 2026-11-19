package inheritence.example7;

public class Lawer extends Employee{

    String department;

    public Lawer(String name, long date, double salary, String department) {
        super(name, date, salary);
        this.department = department;
    }
}
