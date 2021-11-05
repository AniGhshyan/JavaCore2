package Homework.practice;

public class PracticeHomewrk {
    //    Փոխակերպել տրված րոպեն վայրկանի ու վերադարձնել
    long convert(int minutes) {
        return minutes * 60;
    }

    //    ընդունել տարին,վերադարձնել օրերի քանակը
    int calcAge(int years) {
        return years * 365;
    }

    //    վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return ++number;
    }

    //    վերադարձնել true եթե տրված a և b թվերը իրար
    //    հավասար են,եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
//        if (a == b) {
//            return true;
//        }
//            return false;
        return a == b;
    }

    //     վերադարձնել true եթե թիվը փոքր կամ հավասար է 0-ին
    //     մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int number) {
//        if (number <= 0) {
//            return true;
//        } else
//            return false;
        return number <= 0;
    }

    //    վերադարձնել ընդունվող բուլյանի ժխտված արժեքը
    boolean reverseBool(boolean value) {
        return !value;
    }

    //    վերադարձնել երկու մասիվի ամենամեծ lenght-ը
    int maxLength(int[] array1, int[] array2) {
//        if (array1.length > array2.length) {
//            return array1.length;
//        } else
//            return array2.length;
        return array1.length > array2.length
                ? array1.length : array2.length;
    }
}
