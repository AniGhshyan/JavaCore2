package Homework.author;

public class AuthorStorage {
    private Author[] authors = new Author[16];
    private int size = 0;

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] result = new Author[authors.length + 10];
        System.arraycopy(authors, 0, result, 0, size);
        authors = result;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) || authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() > minAge && authors[i].getAge() < maxAge) {
                System.out.println(authors[i]);
            }
        }
    }
}
