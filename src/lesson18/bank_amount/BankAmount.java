package lesson18.bank_amount;

public class BankAmount {
    private long moneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void withdrawAll() {
        System.out.println("Со счёта снято " + moneyAmount + " тг.");
        moneyAmount -= getMoneyAmount();
    }

    public long setMoneyAmount(long newMoneyAmount) {
        return moneyAmount = newMoneyAmount;
    }
}
