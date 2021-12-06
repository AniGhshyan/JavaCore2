package lesson14.IntStack;

public interface IntStack {
    void push(int item);

    int pop();

    default void clear() {
        System.out.println(" default method clear");
    }
}
