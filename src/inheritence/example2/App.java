package inheritence.example2;

public class App {

   public static void main(String[] args) {

       BankAmount bankAmount = new BankAmount();
       bankAmount.setMoneyAmount(10000);
       System.out.println("Количество денег на счету - " + bankAmount.getMoneyAmount() + " тг.");
       bankAmount.withdrawAll();
       System.out.println("Количество денег на счету - " + bankAmount.getMoneyAmount() + " тг.");
    }
}
