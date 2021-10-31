package Homework.charArray;

import javax.print.DocFlavor;

public class CharArrayTest {

    public static void main(String[] args) {

         CharArray charArray=new CharArray();
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        charArray.quantity(bolola);
        charArray.falseOrtrue(bolola);
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        charArray.bob(babola);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        charArray.barev(text);
    }
}
