package Homework.author;

public class Book {
    private String title;
    private String descriptioan;
    private double price;
    private int count;
    private Author author;

    public Book(String title, String descriptioan, double price, int count, Author author) {
        this.title = title;
        this.descriptioan = descriptioan;
        this.price = price;
        this.count = count;
        this.author = author;
    }

    public Book() {

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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", descriptioan='" + descriptioan + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", author=" + author +
                '}';
    }
}
