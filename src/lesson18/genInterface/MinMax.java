package lesson18.genInterface;

public interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}
