package object.theory.theory1;

public class Practice {

    public static void main(String[] args) {

        Object universalTools;

        universalTools = new Person("Kuffy"); /// переманная может принимать  другого обьекта
        System.out.println(universalTools);

        Person[] people = {new Person("Luffy"), new Person("Franky"), new Person("Kuffy")};
        universalTools = people;
        System.out.println(universalTools);

        universalTools = 14;
        System.out.println(universalTools);

        universalTools = "Hello World!";
        System.out.println(universalTools);

        universalTools = true;
        System.out.println(universalTools);

        universalTools =  " 🥟";
        System.out.println(universalTools);


    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}