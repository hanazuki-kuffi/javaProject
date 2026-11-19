package inheritence.example7;

public class MainClass {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Ahat", 35, 600000, 5);
        System.out.println(doctor.getSalary());


        Lawer lawer = new Lawer("Dulat", 5, 950000, "Criminal");
        System.out.println(lawer.getSalary());


    }
}
