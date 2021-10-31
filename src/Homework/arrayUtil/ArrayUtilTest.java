package Homework.arrayUtil;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        arrayUtil.arrayUtil(array);
        arrayUtil.max(array);
        int arrayMax = arrayUtil.max(array);
        System.out.println("max = " + arrayMax);
        arrayUtil.min(array);
        int arraymin = arrayUtil.min(array);
        System.out.println("min = " + arraymin);
        arrayUtil.pair(array);
        arrayUtil.odd(array);
        arrayUtil.sum(array);
        double sum = arrayUtil.sum(array);
        System.out.println("Գումարը հավասար է " + sum);
        System.out.println("Միջին թվաբանականը = է " + sum / array.length);

    }
}
