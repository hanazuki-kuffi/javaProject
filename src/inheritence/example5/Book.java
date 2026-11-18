package inheritence.example5;

public class Book {

    String title;

    public Book(String title) {
       this.title = title;
        System.out.println("Создали книгу с параметром");
    }

    public Book() {
        System.out.println("Создали книгу без параметра");
    }
}
