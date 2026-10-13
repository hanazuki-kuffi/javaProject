public class Hamster {

    String name;
    int weight;
    int age;

    public Hamster(int weight) {
        this.weight = weight;
    }

    public void eat(int foodWeight) {
        weight += foodWeight;
    }

    public void runWheel() {
        weight -= 1;
    }

    public void hideSeeds(int seedsWeight) {
        weight += seedsWeight;
    }
}
