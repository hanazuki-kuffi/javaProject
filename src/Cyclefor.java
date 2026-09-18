public class Cyclefor {
    public static void main(String[] args) {
        cycle1();
    }

    public static void cycle1() {
        int money = 2500; // начальная общая сумма на корм
        int foodPerDay = 500; // цена для одного корма на 1 день
        int days = 0;

        for (money = 2000; money >= 0; money -= foodPerDay) {
            days += 3;
            System.out.println("На " + days + "-й день останется " + money + "тенге.");
        }
        System.out.println("Денег хватит на " + days + " дней.");
    }
}
