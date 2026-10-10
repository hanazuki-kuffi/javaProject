public class Methods3 {
    public static void main(String[] args) {
        sayHello("Pixel");
        sayHello("Bite");


        double[] feedExpensesCat = {500.50, 1270.0, 2590.6, 790.20, 390.0, 890.0, 680.4};
        double[] feedExpensesHamster = {349.50, 739.0, 3413.6, 1219.20, 490.0, 120.0, 923.4};
        findMaxExpense(feedExpensesCat);
        findMaxExpense(feedExpensesHamster);

        findExpensesSum(feedExpensesCat);
        findExpensesSum(feedExpensesHamster);

        sayEnjoyMeal("Pixel");
        sayEnjoyMeal("Bite");

    }


    public static void sayHello(String name) {

        System.out.println("Привет, " + name + "!");
        System.out.println("Привет, " + name + "!");
    }


    public static double findMaxExpense(double[] expenses) {
        double maxFeedExpenseAnimal = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxFeedExpenseAnimal) {
                maxFeedExpenseAnimal = expenses[i];
            }
        }
        System.out.println("Твой самый дорогой корм стоил " + maxFeedExpenseAnimal);
        return 0;
    }
    public static double findExpensesSum(double [] expenses) {
        double sumFeedAnimal = 0;
        for (int i = 0; i < expenses.length; i++) {
            sumFeedAnimal = sumFeedAnimal + expenses[i];
        }
        System.out.println("Всего на корм было потрачено " + sumFeedAnimal);
      return 0;
    }

    public static void sayEnjoyMeal(String name){
        System.out.println("Приятного аппетита, " + name + "!");
        System.out.println("Приятного аппетита, " + name + "!");
    }
}
