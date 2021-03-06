package com.kodilla.testing.Library;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.BookLibrary;
import com.kodilla.testing.library.LibraryDatabase;
import com.kodilla.testing.library.LibraryUser;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary;
        bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksInHandsOf5(){
    LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
    BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    List<Book> resultListOf5Books = generateListOfNBooks(5);

    when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(resultListOf5Books);

    List<Book> books = bookLibrary.listBooksInHandsOf(new LibraryUser("Marek", "Marecki", "2324324324"));
    assertEquals(5, books.size());

    }
    @Test
    public void testListBooksInHandsOf1(){
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf1 = generateListOfNBooks(1);

        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(resultListOf1);

        List<Book> books = bookLibrary.listBooksInHandsOf(new LibraryUser("Tomasz", "Tomczak", "234324324234"));
        assertEquals(1,books.size());
    }
    @Test
    public void testListBooksInHandsOf0() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0 = generateListOfNBooks(0);

        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(resultListOf0);

        List<Book> books = bookLibrary.listBooksInHandsOf(new LibraryUser("Maria", "Marecka", "8797879798"));
        assertEquals(0,books.size());
    }

}
