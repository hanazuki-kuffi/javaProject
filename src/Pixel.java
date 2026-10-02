import java.util.Scanner;

public class Pixel {
    static void main(String[] args) {


        int balls = 15;
        System.out.println("У Пикселя " + balls + " мячиков.");

        playPixel(balls);
        System.out.println("Пикскель вернул все мячики.");
        System.out.println("Их снова " + balls);

    }

    public static void playPixel(int balls) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько мячиков спрятал Пиксель: ");
        int hiddenBalls = scanner.nextInt();

        balls = balls - hiddenBalls;
        System.out.println("Осталось " + balls);

    }
}
