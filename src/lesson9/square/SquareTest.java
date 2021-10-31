package lesson9.square;

public class SquareTest {
    public static void main(String[] args) {
        Square sqr = new Square();
        int x, y;
        x = sqr.square(5);
        y = sqr.square(9);
        y = 2;
        x = sqr.square(y);
        System.out.println(x);
        System.out.println(y);

    }
}
