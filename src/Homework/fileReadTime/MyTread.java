package Homework.fileReadTime;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MyTread extends Thread {
    public static AtomicInteger countOfKeyWord = new AtomicInteger();
    private List<String> treadList;
    private String keyWord;

    MyTread(List<String> treadList, String keyWord) {
        this.treadList=treadList;
        this.keyWord=keyWord;
//        super();
        start();
    }

    public void run() {
        for (String s : treadList) {
            if (s.contains(keyWord)) {
                countOfKeyWord.incrementAndGet();
            }
        }
    }


}
