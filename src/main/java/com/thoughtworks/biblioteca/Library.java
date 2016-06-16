package com.thoughtworks.biblioteca;
import java.io.PrintStream;

public class Library {

    private PrintStream printStream;
    private Book book;

    public Library(PrintStream printStream, Book book) {
        this.printStream = printStream;
        this.book = book;
    }

    public void listBooks() {
        printStream.println(book.getDescription());
    }
}
