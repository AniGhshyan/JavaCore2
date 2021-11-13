package newHomework.figurePainter;

public class FigurPainter {
    int n;
    char c;

    FigurPainter(int n, char c) {
        this.n = n;
        this.c = c;

    }

    void figurePainterOne() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    void figurePainterTwo() {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + c);
            }
            System.out.println();
        }
        System.out.println();
    }

    void figurePainterTree() {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void figurePainterFour() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j > i; j--) {
                System.out.print(" " + c);

            }
            System.out.println();
        }
    }

    void figurePainterFive() {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int j = n - 1; j > i; j--) {
                System.out.print(" " + c);

            }
            System.out.println();

        }
    }
}
