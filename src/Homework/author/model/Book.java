package Homework.author.model;

import java.util.Arrays;

public class Book {
    private String serialId;
    private String title;
    private String descriptioan;
    private double price;
    private int count;
    private Author[] authors;
    private String[] tags;

    public Book(String serialId, String title, String descriptioan, double price, int count, Author[] authors,String[] tags) {
        this.serialId = serialId;
        this.title = title;
        this.descriptioan = descriptioan;
        this.price = price;
        this.count = count;
        this.authors = authors;
        this.tags=tags;
    }

    public Book(String serialId, String title, String descriptioan, double price, int count, Author[] authors) {
        this.serialId = serialId;
        this.title = title;
        this.descriptioan = descriptioan;
        this.price = price;
        this.count = count;
        this.authors = authors;
    }

    public Book() {

    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptioan() {
        return descriptioan;
    }

    public void setDescriptioan(String descriptioan) {
        this.descriptioan = descriptioan;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;}

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        if (count != book.count) return false;
        if (serialId != null ? !serialId.equals(book.serialId) : book.serialId != null) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (descriptioan != null ? !descriptioan.equals(book.descriptioan) : book.descriptioan != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(authors, book.authors)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(tags, book.tags);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = serialId != null ? serialId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (descriptioan != null ? descriptioan.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + count;
        result = 31 * result + Arrays.hashCode(authors);
        result = 31 * result + Arrays.hashCode(tags);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "serialId='" + serialId + '\'' +
                ", title='" + title + '\'' +
                ", descriptioan='" + descriptioan + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", authors=" + Arrays.toString(authors) +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}