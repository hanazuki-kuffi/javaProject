package object;


public class App {

    public static void main(String[] args) {

        String name1 = new String("Zoro");
        String name2 = new String("Zoro");

        String name3 = "Zoro";
        String name4 = "Zoro";

        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2);

        System.out.println(name3.equals(name4));
        System.out.println(name3 == name4);

    }
}
