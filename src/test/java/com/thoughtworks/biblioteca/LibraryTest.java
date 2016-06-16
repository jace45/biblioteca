package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class LibraryTest {

    private PrintStream printStream;
    private Book book;
    private Library library;

    @Before
    public void setUp() throws Exception {
        book = mock(Book.class);
        when(book.getDescription()).thenReturn("Foo");

        printStream = mock(PrintStream.class);

        library = new Library(printStream, book);
    }

    @Test
    public void shouldPrintBookDescriptionWhenListingBooks(){

        library.listBooks();

        verify(book).getDescription();
        verify(printStream).println(contains("Foo"));
    }
}