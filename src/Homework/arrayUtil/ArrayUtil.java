package Homework.arrayUtil;

public class ArrayUtil {


    void arrayUtil(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void pair(int[] array) {
        System.out.println("Մասիվի զույգ տարրերի քանակը : ");
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a++;
            }
        }
        System.out.println(a);
    }

    void odd(int[] array) {
        System.out.println("Մասիվի կենտ տարրերի քանակը :");
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) {
                b++;
            }
        }
        System.out.println(b);
    }

    double sum(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

