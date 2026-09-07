public class Practice {
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        practice4();
    }


        public static void practice1() {

            double rateUSD = 444.06;
            double tenge = 124356.5;

            System.out.println("Отличный курс доллора - рекомендую купить!");
            System.out.println("Ваши сбережения в доллорах: " + tenge / rateUSD);
        }

        public static void practice2() {

        int megabytes = 64000;
        int gigabytes = 64;
        int megabytesPerGigabyte = gigabytes * 1024; // 65536
        int gigabytesToMegabytes = megabytes / gigabytes; // 1000
        boolean isMbMore = megabytesPerGigabyte > gigabytesToMegabytes;
            System.out.println(isMbMore);
        }


        public static void practice3() {

        int answer1 = 3; // Ответ на 1 вопрос      ПРАВИЛЬНЫЙ ВАРИАНТ: 2
        int answer2 = 2; // Ответ на 2 вопрос      ПРАВИЛЬНЫЙ ВАРИАНТ: любой кроме 4
        int answer3 = 1; // Ответ на 3 вопрос      ПРАВИЛЬНЫЙ ВАРИАНТ: 1

            boolean answerNumberOne = answer1 == 2;
            boolean answerNumberTwo = answer2 != 4;
            boolean answerNumberThree = answer3 == 1;

            System.out.println("Результат проверки вопроса 1: " + answerNumberOne);
            System.out.println("Результат проверки вопроса 2: " + answerNumberTwo);
            System.out.println("Результат проверки вопроса 3: " + answerNumberThree);




        }

    public static void practice4() {
        String pixelCat = "Пиксель — хороший кот!";
        boolean isGoodCat = pixelCat.equals("Пиксель — хороший кот!");

        System.out.println(isGoodCat);

    }

}
