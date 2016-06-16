package com.thoughtworks.biblioteca;


import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Book book = new Book("A book", "Jason Bourne", 2000);
        MainMenu mainMenu = new MainMenu(printStream);
        Library library = new Library(printStream, book);
        new ApplicationX(library, printStream, mainMenu).start();
    }
}
