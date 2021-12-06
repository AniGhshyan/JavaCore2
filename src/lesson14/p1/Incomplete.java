package lesson14.p1;

public abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + "  " + b);
    }
}
