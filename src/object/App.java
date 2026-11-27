package object;


public class App {

    public static void main(String[] args) {

        String name1 = new String("Zoro");
        String name2 = new String("Zoro");

        String name3 = "Zoro";
        String name4 = "Zoro";


        Zoro zoro1 = new Zoro("sword man", 3);
        Zoro zoro2 = new Zoro("sword man", 3);



        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2);

        System.out.println(name3.equals(name4));
        System.out.println(name3 == name4);

        System.out.println(zoro1.equals(zoro2));

    }
}

class Zoro {

    String name;
    int age;

    public Zoro(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
