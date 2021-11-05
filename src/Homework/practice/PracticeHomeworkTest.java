package Homework.practice;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomewrk ph = new PracticeHomewrk();
        System.out.println(ph.convert(2));
        System.out.println(ph.calcAge(2));
        System.out.println(ph.nextNumber(56));
        System.out.println(ph.isSameNum(6, 5));
        System.out.println(ph.lessThanOrEqualToZero(-5));
        System.out.println(ph.reverseBool(false));
        int[] array1 = {2, 6, 3, 6, 8, 5, 6, 1,};
        int[] array2 = {5, 6, 9, 54, 87, 25, 14, 65, 21, 7, 96};
        System.out.println(ph.maxLength(array1, array2));

    }
}
