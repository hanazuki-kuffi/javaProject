package Book008;

public class App {

    public static void main(String[] args) {

        Book book1 = new Book("Тонкое искусство пофигизма", " Марк Мэнсон",  2016);
        Book book2 = new Book("Атомные привычки", "Джеймса Клир", 2018);


        book1.printInfo();
        book1.borrowBook("Kuffy");
        book2.borrowBook("Luffy");
        book1.returnBook();
        book1.returnBook();


    }
}
