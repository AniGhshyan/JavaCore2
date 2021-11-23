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
            if (authors[i].getAge() >= minAge && authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }


    public void changeName(String name) {
        for (int i = 0; i < size; i++) {
            authors[i].setName(name);
        }
    }

    public void changeSurnam(String surname) {
        for (int i = 0; i < size; i++) {
            authors[i].setSurname(surname);
        }
    }

    public void changeAge(int age) {
        for (int i = 0; i < size; i++) {
            authors[i].setAge(age);
        }
    }

    public void changeGender(String gender) {
        for (int i = 0; i < size; i++) {
            authors[i].setGendre(gender);
        }
    }

    public void changeEmail(String email) {
        for (int i = 0; i < size; i++) {
            authors[i].setEmail(email);
        }
    }
}
