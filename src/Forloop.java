public class Forloop {
    public static void main(String[] args) {
        loop1();
//        loop2();
//        loop3();
//        loop4();
    }

    public static void loop1() {
        int moneyStart = 2500; // начальная общая сумма на корм
        int foodPerDay = 500; // цена для одного корма на 1 день
        int days = 0;

        for (int money = moneyStart - foodPerDay; money >= 0; money -= foodPerDay) {
            days += 3;
            System.out.println("На " + days + "-й день останется " + money + "тенге.");
        }
        System.out.println("Денег хватит на " + days + " дней.");
    }

    public static void loop2() {

        int startEpisode = 1; // как  я могу менять значение с помощью переменные счетчиками
        int endEpidose = 3; // как  я могу менять значение с помощью переменные счетчиками

        for (int day = 1; day <= 30; day++) {
            System.out.println("День " + day);

            for (int j = startEpisode; j <= endEpidose; j++) {
                System.out.println("Серия " + j);
            }

            startEpisode += 3;
            endEpidose += 3;
        }
        System.out.println("Ура! Вы прокачали и Java, и английский!");
    }


    public static void loop3() {
        int everyFlatsNumber = 5; // Количество квартир на этаже
        int floorsNumber = 10;// Количество этажей

        for (int i = 1; i <= floorsNumber; i++) {
            int currentFlat = (i - 1) * everyFlatsNumber + 1;
            for (int j = currentFlat; j < currentFlat + everyFlatsNumber; j++) {
                System.out.println("Этаж " + i + " квартира " + j + " — доставлено.");
            }
        }
    }
    public static void loop4() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Круг " + i);

            if (i % 2 == 0) // Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
                for (int a = 1; a <= 5; a++) System.out.println("  Приседаем " + a);
             else {
                for (int j = 1; j <= 3; j++) System.out.println("  Отжимаемся " + j);
            }
            for (int z = 1; z <= 7; z++) {
                System.out.println("  Качаем пресс " + z);
            }
        }

        System.out.println("Хороший темп, так держать!");
        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}
