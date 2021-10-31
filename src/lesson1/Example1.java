package lesson1;

public class Example1 {

    public static void main(String[] args) {
        int a, a2;
        a = 5;
        a2 = a;
        System.out.println("a = " + a);
        a = a * 2;
        System.out.println("a = " + a);
        System.out.println("a2 = " + a2);
        if (a >= a2) {
            System.out.println("a > կամ = a2");
        } else {
            System.out.println("a < a2");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("kuku " + (i + 1));

        }
    }
}
