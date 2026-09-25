public class Returnbreak {

    public static void returnExample() {
        boolean flag = true;

        while (flag) {
            System.out.println("Начнем цикл! ");
            return;
        }
        System.out.println("если ты видишь этот строку то retutn поменяли на break!");
    }

    public static void breakExample() {
        boolean flag = true;
        while (flag) {
            System.out.println("Начнем цикл!");
        }
;    }
}
