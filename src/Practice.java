public class Practice {
    public static void main(String[] args) {
        practice1();
        practice2();
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
        boolean isMore = megabytesPerGigabyte > gigabytesToMegabytes;
            System.out.println(isMore);
        }

}
