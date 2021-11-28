package lesson13.figure;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Քառանկյան մակերես");
        return dim1 * dim2;
    }
}
