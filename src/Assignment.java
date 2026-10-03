public class Assignment {

    public static void main(String[] args) {

        // Ниже вызовите новый метод
//        String highestGrossingFilm = findHighestGrossingFilm();
//        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);

        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax(-7, -1));
    }

    public static String findHighestGrossingFilm() {

        String film1 = "Титаник";
        int income1 = 2194;
        String film2 = "Аватар";
        int income2 = 2810;
        String film3 = "Тёмный рыцарь";
        int income3 = 1084;


        if (income1 > income2 && income1 > income3) {
            return film1;
        } else if (income2 > income1 && income2 > income3) {
            return film2;
        } else  {
            return film3;
        }
    }

    public static int findMax(int a, int b) {
        if ( a > b) {
            return a;
        }return b;
    }
}
