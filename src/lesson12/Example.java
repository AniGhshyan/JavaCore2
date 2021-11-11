package lesson12;

public class Example {
    public static void main(String[] args) {
        String text="Hello (ja{v]a0";
//        char[] chars= text.toCharArray();
//        char c= text.charAt(0);
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));

        }
    }
}
