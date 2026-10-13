package Book008;

public class Book {

    String title;
    String author;
    int year;
    boolean isAvailable;

    public Book(String title, String author, int year) {

        this.title = title;
        this.author = author;
        this.year = year;
        isAvailable = true;

    }

    void printInfo () {
        System.out.println("Название: " + title + ", " + "Автор: " + author + ", " + "Год: " + year + ", " + "Доступна: " + isAvailable);
    }

    void borrowBook(String readerName) {

        if (isAvailable == true) {
            System.out.println(readerName + " взял(а) книгу " + title);
            isAvailable = false;
        }
        else {
            System.out.println("Книга " + title + " уже выдана!");

        }
    }
    void returnBook() {
        if (isAvailable == false) {
            System.out.println("Книга " + title + " возвращена в библиотеку.");
            isAvailable = true;
        }
        else {
            System.out.println("Книга " + title + " уже на месте.");
        }
    }

    boolean isClassic() {
        if (year == 1950) {
            return true;
        }
        return false;
    }
}
