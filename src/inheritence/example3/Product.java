package inheritence.example3;

public class Product {

    private String name;
    private double price;
    public Product(String nameProduct, double priceProduct) {
        name = nameProduct;
        price = priceProduct;
    }
    public double getPrice() { //изменяли модификатор доступа private на public
        return price;
    }
}
