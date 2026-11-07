package lesson15.examples;

public class Practice9 {
    public static void main(String[] args) {

        int number = 10;
        changeVariable(number);
        System.out.println(number);

    }

    private static void changeVariable(int variable) {

        variable = variable * 3;
    }
}
