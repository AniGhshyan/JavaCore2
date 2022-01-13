package Homework.fileReadTime;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleRead {
    public static String path = "C:\\Users\\User\\Downloads\\simple.txt";
    public static AtomicInteger countOfKeyWord = new AtomicInteger();

    public static void main(String[] args) throws IOException {
        String keyWord = "asdf";
        long count = Files.lines(Paths.get(path)).count();
        System.out.println("all lines: " + count);
        long currentTime = System.currentTimeMillis();
        List<String> strings = Files.readAllLines(Paths.get(path));
        for (String string : strings) {
            if (string.contains(keyWord)) {
                countOfKeyWord.incrementAndGet();
            }
        }
        System.out.println("found lines: " + countOfKeyWord);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));

    }
}
