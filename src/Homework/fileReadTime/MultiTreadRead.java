package Homework.fileReadTime;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiTreadRead {
    public static String path = "C:\\Users\\User\\Downloads\\simple.txt";
    public static AtomicInteger countOfKeyWord = new AtomicInteger();

    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(path));
        String keyWord = "asdf";
        long count = Files.lines(Paths.get(path)).count();
        System.out.println("all lines: " + count);
        long currentTime = System.currentTimeMillis();
        for (String string : strings) {
            if (string.contains(keyWord)) {
                countOfKeyWord.incrementAndGet();
            }
        }
        System.out.println("found lines: " + countOfKeyWord);
        int numberOfTrad = 2;
        int sizeForTreadLines = strings.size() / numberOfTrad;
        List<String> tread1List = strings.subList(1, sizeForTreadLines);
        List<String> tread2List = strings.subList(sizeForTreadLines + 1, strings.size());

        MyTread myTread = new MyTread(tread1List, keyWord);
        MyTread myTread1 = new MyTread(tread2List, keyWord);
        try {
            myTread.join();
            myTread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));

    }
}
