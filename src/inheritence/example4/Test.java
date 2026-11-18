package inheritence.example4;

public class Test {

    public static void main(String[] args) {

        Account account = new Account(2000); // нахуя тут нужна такое ?

        System.out.println(account.getBalance(3000)); //

    }
}

class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance(double balance){
        return this.balance = balance;
    }
}
