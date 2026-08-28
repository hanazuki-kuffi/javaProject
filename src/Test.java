import java.util.Scanner;

public class Test {
//    public static void main(String[] args) {
//        for (int a = 1; a <= 3; a++) {
//            System.out.println("Это первый цикл! Я выполняюсь " + a + " раз");
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("     Это второй цикл! Я выполняюсь " + i + " раз");
//            }
//        }
//    }


//public static void main(String[] args) {
//    for (int a = 1; a <= 3; a++) {
//        System.out.println("Это первый цикл! Я выполняюсь " + a + " раз");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("     Это второй цикл! Я выполняюсь " + i + " раз");
//            if (a == 2) {
//                break;
//            }
//        }
//    }
//}


//    public static void main(String[] args) {
//
//        for (int a = 1; a <= 7; a++) {
//             System.out.println(a + " я выполняюсь перед continue");
//            if (a > 2) {
//                continue;
//            }
//             System.out.println("    " + a + ": я выполняюсь всего 2 раза");
//        }
//    }
//}


    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = scan.nextInt();

        System.out.println("Your number: "+ number1);
    }
}