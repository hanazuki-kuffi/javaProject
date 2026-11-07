package lesson15.examples;

public class Practice11 {

    public static void main(String[] args) {

        Cat pixel = new Cat("Orange");
        changeColor(pixel);

        System.out.println(pixel.color + " очень идёт коту.");

    }

    public static void changeColor(Cat color) {
        color.color = "black";
    }
}

class Cat {

    String color;

    public Cat(String color) {
        this.color = color;
    }
}
