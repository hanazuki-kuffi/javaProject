public class Cycle {
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
//        example4();
//        example5();
//        example6();
//        example7();
//        example8();
        example9();
    }
    public static void example1() {
        int number = 1;
        while (number <= 5) {
            System.out.println("Currently value for one cycle: " + number);
            number++;
        }
    }

    public static void example2() {
        int number = 1;
        while (number < 5) {
            number++;
            System.out.println("Currently value for one cycle: " + number);
        }
    }

    public static void example3() {
        int number = 1;
        while (number <= 5) {
            System.out.println("Currently value for one cycle: " + number);
            number++;
        }
    }

    public static void example4() {
        int number = 1;
        while (number <= 5) {
            number++;
            System.out.println("Currently value for one cycle:  " + number);
        }
    }

    public static void example5() {
        int number = 1;
        while (number <= 5) {
            System.out.println("Currently value for one cycle: " + number);
            number++;
        }
        System.out.println("Currently value for one cycle: " + number);
    }

    public static void example6() {
        int number = 1;
        while (number <= 5) {
            number++;
            System.out.println("Currently value for one cycle: " + number);
        }

        System.out.println("Currently value for one cycle: " + number);
    }

    public static void example7() {
        int number = 1;
        do {

            System.out.println("Currently value for one cycle: " + number);
            number++;
        } while (number > 5);
    }

    public static void example8() {
        int number = 1;
        while (number < 10) {

            System.out.println("Hello! I am writing some times");
            number++;
        }
    }

    public static void example9() {
        int number = 1;
        while (number <= 100) {
            if (number % 3 == 0) {
                System.out.println("Number divided by 3: " + number);
            }
            number ++;
        }
    }
}
