package Homework.author;

public class BookStorage {
    private Book[] books = new Book[16];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBooksByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBooksByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().contains(email)) {
                System.out.println(books[i]);
            }

        }
    }

    public void countBook(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().contains(email)) {
                if (books[i].getTitle() != null) {
                    count = books[i].getCount();
                } else {
                    System.out.println("do not have a book yet");
                }
            }
        }
        System.out.println("This author has " + count + " books");
    }


    public Book getByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }


    public void changeBookAothor(String name, String surname, String email, int age, String gender) {
        for (int i = 0; i < size; i++) {
            Author author=new Author(name,surname,email,age,gender);
            books[i].setAuthor(author);
        }
    }
}
