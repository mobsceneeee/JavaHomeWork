package com.pb.rublevskij.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "AT", "21.10.1999", "+6711111");
        Reader reader2 = new Reader("Иванов И.И.", 2, "FIT", "11.11.1997", "+6722222");
        Reader reader3 = new Reader("Сидоров А.А.", 3, "CIITS", "05.04.2005", "+6733333");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Приключения", "Лю Цысинь", "1932");
        Book book2 = new Book("Словарь", "Фрэнк Герберт", "1854");
        Book book3 = new Book("Энциклопедия", "Стругацкие", "1695");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь","Энциклопедия");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook(3);
        reader1.returnBook("Приключения", "Словарь","Энциклопедия");
        reader3.returnBook(book1, book2,book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}