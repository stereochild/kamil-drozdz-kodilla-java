package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Book firstBook = new Book ("Metro 2033", "Dmitry Glukhovsky", 2005, "001");
        Book secondBook = new Book ("Metro 2034", "Dmitry Glukhovsky", 2009, "002");
        Book thirdBook = new Book ("Metro 2035", "Dmitry Glukhovsky", 2015, "003");
        Book fourthBook = new Book ("The Postman", "David Brin", 1985, "004");
        Book fifthBook = new Book ("A Canticle for Leibowitz", "Walter M. Miller jr.",1960, "005");

        Set<Book> books = new HashSet<>();
        books.add(firstBook);
        books.add(secondBook);
        books.add(thirdBook);
        books.add(fourthBook);
        books.add(fifthBook);

        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2005, median);
        System.out.println("The publication year median in Library is: " + median);

    }
}
