package Homework;

public class CharArray1 {

    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        int num = 0;
        char c = 'o';
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                num++;
            }

        }
        System.out.println("'o' սինվոլի քանակը = " + num);
        System.out.println("Մաասիվի մեջտեղի 2 սիմվոլներն են ");
        System.out.print("   " + bolola[(bolola.length - 1) / 2] + " ");
        System.out.println(bolola[(bolola.length - 1) / 2 + 1]);
        boolean k = false;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'y') {
                k = true;
            }

        }
        System.out.println(k);
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean bob = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                bob = true;
                break;
            }

        }
        System.out.println(bob);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
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
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }
    }
}
