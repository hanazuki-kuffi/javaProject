package lesson18.product;

public class App {

    public static void main(String[] args) {

        Product product = new Product("Пирожок", 180.0);
        System.out.println("Стоимость продукта - " + product.getPrice() + " тг.");
    }
}
