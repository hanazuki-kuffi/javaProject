public class Cyclefor {
    public static void main(String[] args) {
//        cycle1();
        cycle2();
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

    public static void cycle2() {

        for (int day = 1; day <= 30; day++) {
            System.out.println("День " + day);

            int startEpisode = 1;
            int endEpidose = 3;

            for (int j = startEpisode; j <= endEpidose; j++) {
                System.out.println("Серия " + j);
            }
        }
    }
}
