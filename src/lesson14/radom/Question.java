package lesson14.radom;

import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prod = (int) (100 * rand.nextDouble());
        if (prod < 30) {
            return NO;
        } else if (prod < 60) {
            return YES;
        } else if (prod < 75) {
            return LATER;
        } else if ((prod < 98)) {
            return SOON;
        } else {
            return NEVER;
        }

    }
}
