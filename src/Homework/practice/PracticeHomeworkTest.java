package Homework.practice;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomewrk practiceHomewrk = new PracticeHomewrk();
        System.out.println(practiceHomewrk.convert(2));
        System.out.println(practiceHomewrk.calcAge(2));
        System.out.println(practiceHomewrk.nextNumber(56));
        System.out.println(practiceHomewrk.isSameNum(6, 5));
        System.out.println(practiceHomewrk.lessThanOrEqualToZero(-5));
        System.out.println(practiceHomewrk.reverseBool(true));
        int[] array1 = {2, 6, 3, 6, 8, 5, 6, 1,};
        int[] array2 = {5, 6, 9, 54, 87, 25, 14, 65, 21, 7, 96};
        System.out.println(practiceHomewrk.maxLenght(array1, array2));

    }
}
