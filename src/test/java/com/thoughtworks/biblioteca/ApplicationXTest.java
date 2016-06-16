package com.thoughtworks.biblioteca;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ApplicationXTest {
    private PrintStream printStream;
    private Library library;
    private ApplicationX applicationX;
    private MainMenu mainMenu;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        library = mock(Library.class);
        mainMenu = mock(MainMenu.class);
        applicationX = new ApplicationX(library, printStream, mainMenu);
    }

    @Test
    public void shouldWelcomeUserWhenStarting(){
        applicationX.start();

        verify(printStream).println(contains("Welcome"));
    }



    @Test
    public void shouldListBooksWhenStarting() {

        applicationX.start();
        verify(library).listBooks();
    }

    @Test
    public void shouldDisplayMainMenuWhenStarting(){

        applicationX.start();
        verify(mainMenu).display();
    }
}