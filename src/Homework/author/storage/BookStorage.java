package Homework.author.storage;

import Homework.author.exception.BookNotFoundException;
import Homework.author.model.Author;
import Homework.author.model.Book;
import Homework.author.util.ArrayUtil;
import Homework.author.util.FileUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookStorage {
    private List<Book> books = new LinkedList<>();

    public void add(Book book) {
        books.add(book);
        serialize();
    }

    public void print() {
        for (Book book : books) {
            System.out.println(book);
        }
//
//        Iterator<Book> iterator = books.iterator();
//        while (iterator.hasNext()) {
//            Book book = iterator.next();
//            System.out.println(book);
//        }
    }

    public Book getBySerialId(String serialId) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getSerialId().equals(serialId)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book does not exists.serialId: " + serialId);
    }

    public void searchBooksByTitle(String keyword) {
        for (Book book : books) {
            if (book.getTitle().contains(keyword)) {
                System.out.println(book);
            }
        }
    }

    public void searchByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                System.out.println(book);
            }
        }
    }

    public void countByAuthor(Author author) {
        int count = 0;
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                count++;
            }
        }
        System.out.println("Count of " + author.getEmail() + " author's book is " + count);
    }

    public void deleteByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                books.remove(book);
            }
        }
        serialize();
    }

    public void delete(Book book) {
        books.remove(book);
        serialize();
    }

    public void initData() {
        List<Book> bookList = FileUtil.deserializeBooks();
        if (bookList != null) {
            books = bookList;
        }
    }

    public void serialize() {
        FileUtil.serializeBooks(books);
    }
}
