public class App {

    static void main(String[] args) {
        Hamster hamster1 = new Hamster(150);
        Hamster hamster2 = new Hamster(150);

        hamster1.eat(5);
        System.out.println(hamster1.weight);
        System.out.println(hamster2.weight);
    }
}
