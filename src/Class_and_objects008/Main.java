package Class_and_objects008;

public class Main {

    public static void main(String[] args){

        Hamster bite = new Hamster("bite", "orange", 320, 1);
        Hamster ninja = new Hamster("ninja", "black", 400, 2);
        Hamster kuzya = new Hamster("kuzya", "white", 350, 1);
        Hamster paskal = new Hamster("paskal", "spotted", 300, 2);

        System.out.println(bite.name);
        System.out.println(ninja.name);
        System.out.println(kuzya.name);
        System.out.println(paskal.name);

    }
//    public static void eat(double meal) {
//        Hamster homka = new Hamster();
//        homka.weight += meal;
//        System.out.println("New weight: " + homka.weight);
//    }
}
