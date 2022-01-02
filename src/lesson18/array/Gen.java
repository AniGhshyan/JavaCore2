package lesson18.array;

public class Gen<T extends Number> {
    T ob;
    T vails[];

    Gen(T o, T[] nums) {
        ob = o;
        vails = nums;
    }
}
