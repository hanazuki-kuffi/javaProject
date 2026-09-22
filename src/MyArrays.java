import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
//        arrays1();
//        arrays2();
//        arrays3();
        arrays4();
    }


        public static void arrays1() {
            String[] currencies = {"USD", "EUR", "JPY", "KZT"};
//        System.out.println(currencies);


            System.out.println(Arrays.toString(currencies));
        }


        public static void arrays2() {

        String[] currencies = new String[4];
            System.out.println(Arrays.toString(currencies));
        }

        public static void arrays3() {

        int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(numbers));
        }

        public static void arrays4() {
        int[] numbers = new int[5];
            System.out.println(Arrays.toString(numbers));
        }

        public static void arrays5() {

        }
}
