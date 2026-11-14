package lesson18.bank_amount;

public class App {

   public static void main(String[] args) {

       BankAmount bankAmount = new BankAmount();

       System.out.println("Количество денег на счету - " + bankAmount.getMoneyAmount() + " тг.");
       bankAmount.withdrawAll();
       System.out.println("Количество денег на счету - " + bankAmount.getMoneyAmount() + " тг.");
    }
}
