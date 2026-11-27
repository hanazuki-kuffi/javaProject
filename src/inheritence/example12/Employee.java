package inheritence.example12;

public class Employee {

     private String name;
     private double baseSalary;


     public Employee(String name, double baseSalary) {
         this.name = name;
         this.baseSalary = baseSalary;
     }

    public double getSalary() {
        return  baseSalary;
    }

    public String getName(){
         return name;
    }

}
