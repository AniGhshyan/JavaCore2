package Homework.practice;

public class PracticeHomewrk {
    //    Փոխակերպել տրված րոպեն վայրկանի ու վերադարձնել
    long convert(int n) {
        return n * 60;
    }

    //    ընդունել տարին,վերադարձնել օրերի քանակը
    int calcAge(int n) {
        return n * 365;
    }

    //    վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return number + 1;
    }

    //    վերադարձնել true եթե տրված a և b թվերը իրար
    //    հավասար են,եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else
            return false;
    }

    //     վերադարձնել true եթե թիվը փոքր կամ հավասար է 0-ին
    //     մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else
            return false;
    }

    //    վերադարձնել ընդունվող բուլյանի ժխտված արժեքը
    boolean reverseBool(boolean value) {
        if (value == true) {
            return false;
        } else
            return true;
    }

    //    վերադարձնել երկու մասիվի ամենամեծ lenght-ը
    int maxLenght(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;
        } else
            return array2.length;
    }
}
