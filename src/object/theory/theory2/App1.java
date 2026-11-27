package object.theory.theory2;

import javax.swing.*;
import java.util.Objects;

public class App1 {
    public static void main(String[] args) {

        String title = "Atomic habit";
        String author = "James Clear";
        int pagesNumber = 320;


        Book book1 = new Book(title, author, pagesNumber);
        Book book2 = new Book(title, author, pagesNumber);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.getClass());
        System.out.println(book2.getClass().getSimpleName());


//        boolean result2 = book1 == book2;
//        System.out.println(result2); /// false


        ///Для сравнения объектов собственных классов, будь то книги, хомяки или космические корабли, метод equals(Object) нужно переопределить

//        boolean result3 = book1.equals(book2);
//        System.out.println(result3);  /// false

    }
}

class Book {

    String title;
    String author;
    int pagesNumber;

    public Book(String title, String author, int pagesNumber) {

        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

//    @Override
//    public String toString() {
////        return (title + " " + author + " " + pagesNumber);
//        return "Info {" +
//                "title = " + title + ", author = " + author + ", pagesNumber = " + pagesNumber  + "}";
//    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true; /// проверяем адреса объектов
        if (this == null) return false; /// не была ли передана в метод equals(Object) пустая ссылка null вместо объекта.
        if (this.getClass() != object.getClass()) return false; ///сравниваем классы объектов
        Book thisBook = (Book) object; ///привели второй объект к классу Book
        return Objects.equals(title, thisBook.title) && Objects.equals(author, thisBook.author) && Objects.equals(pagesNumber, thisBook.pagesNumber);
    }
}
