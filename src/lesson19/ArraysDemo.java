package lesson19;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }
        System.out.print("Иcxoдный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Oтcopтиpoвaнный массив: ");
        display(array);
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Maccив после вызова метода fill(): ");
        display(array);
        Arrays.sort(array);
        System.out.print("Maccив после повторной сортировки: ");
        display(array);
        System.out.print("Знaчeниe -9 находится на позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    private static void display(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
