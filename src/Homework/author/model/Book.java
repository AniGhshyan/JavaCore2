package Homework.author.model;

public class Book {
    private String serialId;
    private String title;
    private String descriptioan;
    private double price;
    private int count;
    private Author author;


    public Book(String serialId,String title, String descriptioan, double price, int count, Author author) {
        this.title = title;
        this.descriptioan = descriptioan;
        this.price = price;
        this.count = count;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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
        return author != null ? author.equals(book.author) : book.author == null;
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
        result = 31 * result + (author != null ? author.hashCode() : 0);
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
                ", author=" + author +
                '}';
    }
}
