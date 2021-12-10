package lesson15;

public class Exc2 {
    public static void main(String[] args) {
        int a,d;
       try {
           d=0;
           a=42/d;
           System.out.println("Это не будет выведено.");
       }catch (ArithmeticException e){
           System.out.println("Деление на нуль");
       }
        System.out.println("после оператора catch");
    }
}
