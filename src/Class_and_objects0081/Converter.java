package Class_and_objects0081;

public class Converter {
    static double rateUSD;
    static double rateEUR;
    static double rateJPY;

    public Converter(double usd, double eur, double jpy) {
       this.rateUSD = usd;
       this.rateEUR = eur;
       this.rateJPY = jpy;
    }

    public static void convert(double tenges, int currency) {
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + tenges / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + tenges / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в йенах: " + tenges / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
