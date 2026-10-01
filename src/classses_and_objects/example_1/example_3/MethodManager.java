package classses_and_objects.example_1.example_3;

public class MethodManager {

    void test() {
        System.out.println("test");
    }

    String greeting(String name) {
        System.out.println("Hello " + name);
        return "greeting";
    }

    boolean isThere(String pos) {
        if(pos.equals("left")) {
            System.out.println("It's fine");
            return true;
        }
        return false;
    }
}
