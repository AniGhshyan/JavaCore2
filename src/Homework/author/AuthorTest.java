package Homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author authors1 = new Author("Poxos", "Poxosyan", "Poxospoxos", 25, "boy");
        Author authors2 = new Author("Petros", "Petrosyan", "Petrospetros", 26, "boy");
        AuthorStorage authorStorage = new AuthorStorage();
        authorStorage.add(authors1);
        authorStorage.add(authors2);
        System.out.println("Քանի հեղինակ ունենք");
        System.out.println(authorStorage.size);
        int num = scanner.nextInt();
        if (num < 0 || num > authorStorage.size) {
            System.out.println("Այսպիսի հեղինակ չունենք");
        }
        switch (num){
            case 1:
                System.out.println(authors1);
                break;
            case 2:
                System.out.println(authors2);
                break;
            case 3:

        }

    }
}
