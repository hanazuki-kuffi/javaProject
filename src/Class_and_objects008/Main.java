package Class_and_objects008;

public class Main {

    public static void main(String[] args){

        Hamster homka = new Hamster();
        homka.name = "Homka";
        System.out.println("Name: " + homka.name);
        System.out.println("Age: " + homka.age);
        System.out.println("Color: " + homka.color);
        System.out.println("Weight: " + homka.weight);
        eat(15);

    }
    public static void eat(double meal) {
        Hamster homka = new Hamster();
        homka.weight += meal;
        System.out.println("New weight: " + homka.weight);
    }

}
