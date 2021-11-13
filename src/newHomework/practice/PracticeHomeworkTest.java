package newHomework.practice;

import Homework.practice.PracticeHomewrk;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.convert(3));
        System.out.println(ph.calcAge(1));
        System.out.println(ph.nextNumber(99));
        System.out.println(ph.isSameNum(2, 7));
        System.out.println(ph.lessThanOrEqualToZero(6));
        System.out.println(ph.reverseBool(true));
        int[] array1 = {78, 8, 3, 11, 8, 5, 236, 1,};
        int[] array2 = {6, 26, 9, 54, 87, 25, 14, 615, 21, 7, 96,145};
        System.out.println(ph.maxLength(array1, array2));

    }
}
