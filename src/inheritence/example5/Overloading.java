package inheritence.example5;

public class Overloading {

    public void test(Cat cat) {

    }
    public void test(String a, int b) { //перегрузка методов

    }
    public void test(int b, String a) { //перегрузка методов

    }
    public void test(String a) { //перегрузка методов
        System.out.println("Строка a: " + a);
    }
    public void test(int b) { //перегрузка методов
        System.out.println("Integer b: " + b);
    }
    public void test(double c) { //перегрузка методов
        System.out.println("Double c: " + c);
    }


}

class Cat {
    String name;
}