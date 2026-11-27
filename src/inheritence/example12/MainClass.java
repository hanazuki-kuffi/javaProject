package inheritence.example12;

import inheritence.example12.Employee;
import inheritence.example12.Intern;
import inheritence.example12.Manager;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Manager("Suzuki", 350000));
        employees.add(new Intern("Yamada", 200000));
        employees.add(new Employee("Taira", 600000));


        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Salary: " +employee.getSalary());
        }
    }
}
