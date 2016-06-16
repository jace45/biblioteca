package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class MainMenu {
    private PrintStream printStream;

    public MainMenu(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void display() {
        printStream.println("Choose options: \n1. List Books");
    }
}
