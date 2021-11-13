package newHomework.charArray;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        CharArray charArray = new CharArray(bolola);
        System.out.println("'o'quantity = " + charArray.quantity());
        charArray.twoElements();
        System.out.println(charArray.isTrueOrFalse());
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        System.out.println(charArray.bob(babola));
        char[] text = {' ', ' ', 'b', 'a', ' ', 'r', ' ', 'e', 'v', ' ', ' '};
        System.out.print(charArray.text(text));
    }
}
