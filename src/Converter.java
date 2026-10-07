public class Converter {

    double rateUSD = 450;
    double rateEUR = 500;
    double rateJPY = 3;

    public void convert(double tenges, int currency) {

        if (currency == 1) {
            System.out.println("Ваши сбережения в доллорах: " + tenges / rateUSD);
        }
        else if (currency == 2) {
            System.out.println("Ваши сбережения в еврах: " + tenges / rateEUR);
        }
        else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + tenges / rateJPY);
        }
        else {
            System.out.println("Неизвесьная валюта!");
        }

    }
}
