package newHomework.charArray;

public class CharArray {
    char[] chars = new char[10];

    CharArray(char[] chars) {
        this.chars = chars;
    }

    CharArray() {

    }

    int quantity() {
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                num++;
            }
        }
        return num;
    }

    void twoElements() {
        System.out.print(chars[(chars.length / 2) - 1] + " and ");
        System.out.println(chars[chars.length / 2]);
    }

    boolean isTrueOrFalse() {
        boolean b = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[chars.length - 2] == 'l' && chars[chars.length - 1] == 'y') {
                b = true;
            }
        }
        return b;
    }

    boolean bob(char[] chars) {
        boolean b = false;
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == 'b' && chars[i + 2] == 'b') {
                b = true;
            }
        }
        return b;
    }

    char[] text(char[] chars) {
        int startindex=0;
        int endindex=chars.length-1;
        while (startindex<endindex&& chars[startindex]==' ') {
                    startindex++;
            }
           while (startindex<endindex&&chars[endindex]==' '){
               endindex--;
           }
           char[]text=new char[(endindex-startindex)+1];
           int index=0;
        for (int i =startindex; i <=endindex; i++) {
            text[index++]=chars[i];

        }
        return text;
    }
}
