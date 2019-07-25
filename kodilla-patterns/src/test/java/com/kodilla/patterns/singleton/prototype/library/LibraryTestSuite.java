package com.kodilla.patterns.singleton.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void  testGetBooks() {
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("title" + n,"author" + n, LocalDate.of(1999,04,04))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().add(new Book("title7","author7", LocalDate.of(1999,04,04)));
        library.getBooks().add(new Book("title8","author8", LocalDate.of(1999,04,04)));

        System.out.println(library.getName());
        System.out.println(clonedLibrary.getName());
        System.out.println(deepClonedLibrary.getName());
        Assert.assertEquals(7,library.getBooks().size());
        Assert.assertEquals(7,clonedLibrary.getBooks().size());
        Assert.assertEquals(5,deepClonedLibrary.getBooks().size());
    }

}
