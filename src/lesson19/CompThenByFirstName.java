package lesson19;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }

}
