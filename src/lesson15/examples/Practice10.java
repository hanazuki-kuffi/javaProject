package lesson15.examples;

public class Practice10 {

    public static void main() {

        int number = 10;
        number = changeVariable(number);
        System.out.println(number);

    }

    private static int changeVariable(int variable) {

        return variable *= 3;
    }
}
