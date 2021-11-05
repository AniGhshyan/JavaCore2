package Homework.dynamicArray;

import java.util.Scanner;

public class DynamicArrayTest {

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            da.add(i);
        }
        for (int i =10; i < 20; i++) {
            da.add(i);

        }
        System.out.println(da.getByIndex(5));
        da.print();
    }
}
