package Homework;

public class SortArray1 {

    public static void main(String[] args) {

        int[] array = {3, 6, 9, 1, 5, 8, 44, 63, 21};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
