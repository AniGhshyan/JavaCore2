package Homework;

public class ArrayUtil1 {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("max = " + max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("Մասիվի զույգ տարրերն են ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();
        System.out.println("Մասիվի զույգ տարրերի քանակը : ");
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                a++;

            }

        }
        System.out.println(a);
        System.out.println();
        System.out.println("Մասիվի կենտ տարրերի քանակը :");
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) {
                b++;
            }

        }
        System.out.println(b);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Միջին թվաբանականը  = " + sum / array.length);

    }
}
