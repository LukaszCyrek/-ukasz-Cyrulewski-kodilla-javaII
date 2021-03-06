package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.forum.stream.book.Book;
import java.forum.stream.book.BookDirectory;
import java.util.List;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        BookDirectory bookDirectory = new BookDirectory();
        List<Book> books = bookDirectory.getList();

        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book: books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++ ;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

}
