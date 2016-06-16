package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuTest {

    @Test
    public void shouldShowListBooksOption(){

        PrintStream printStream =  mock(PrintStream.class);
        MainMenu mainMenu = new MainMenu(printStream);

        mainMenu.display();

        verify(printStream).println("Choose options: \n1. List Books");
    }
    
    @Test
    public void test() {
        
        
     }

}