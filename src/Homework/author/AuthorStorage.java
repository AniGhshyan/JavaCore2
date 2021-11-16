package Homework.author;

public class AuthorStorage {
    private Author[] array;
    public int size = 0;
    Author author=new Author();

    AuthorStorage() {
        array = new Author[5];
    }

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] result = new Author[array.length + 5];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        array = result;
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index" + index);
            return null;
        }
        return author;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            System.out.println();
        }
        System.out.println();
    }

}
