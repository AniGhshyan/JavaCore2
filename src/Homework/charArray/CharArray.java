package Homework.charArray;

public class CharArray {

    void quantity(char[] bolola) {
        int num = 0;
        char c = 'o';
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                num++;
            }
        }
        System.out.println("'o' սինվոլի քանակը = " + num);
    }

    boolean falseOrtrue(char[] bolola) {
        boolean k = false;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'y') {
                k = true;
            }

        }
        return k;

    }

    boolean bob(char[] babola) {
        boolean bob = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                bob = true;
                break;
            }
        }
        return bob;

    }

    char[] trim(char[] text) {
        int startIndex = 0;
        int endIndex = text.length - 1;
        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        while (startIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;

        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];
        }
        return result;
    }
}


