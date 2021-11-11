package Homework.dynamicArray;

import java.util.Scanner;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        System.out.println(da.isEmpty());
        da.add(5);
        int[] numbers = {33, 44, 55};
        da.add(numbers);
        da.print();
        da.add(66,2);
        da.print();
        da.set(2,3);
        da.print();
        System.out.println(da.isEmpty());
        System.out.println(da.isExists(66));
        System.out.println(da.isExists(88));
    }
}
