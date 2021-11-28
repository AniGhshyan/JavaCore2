package lesson13.figure;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("եռանկյան մակերես");
        return dim1 * dim2 / 2;
    }
}
