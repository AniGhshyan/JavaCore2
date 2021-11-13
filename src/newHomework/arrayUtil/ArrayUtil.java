package newHomework.arrayUtil;

public class ArrayUtil {
    int[] array = new int[10];

    ArrayUtil(int[] array) {
        this.array = array;
    }

    void elements() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int max() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    int min() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    void pairElements() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void oddElements() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    int pairElementsQuantity() {
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                n++;
            }
        }
        return n;
    }

    int oddElementsQuantity() {
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                n++;
            }
        }
        return n;
    }

    double sum() {
        int sum = 0;
        for (double x : array) {
            sum += x;
        }
        return sum;
    }

    double average() {
        return sum() / array.length;
    }
}
