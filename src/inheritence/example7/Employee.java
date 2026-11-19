package inheritence.example7;

public class Employee {

    private String name;
    private long date;
    private double salary;

    public Employee(String name, long date, double salary) {
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    public double getSalary() {
        return salary / 100;
    }


}
