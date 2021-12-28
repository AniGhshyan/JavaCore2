package Homework.file;

import java.io.*;
import java.util.Scanner;

public class ContentSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input path");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.out.println("Path does not exists or is not directory");
        } else {
            System.out.println("Please input keyword");
            String keyword = scanner.nextLine();
            findFile(path, keyword);
        }

    }

    public static void findFile(File parent, String keyword) {

        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, keyword);
            } else {
                if (file.getName().endsWith(".txt")) {
                    searchKeyword(file, keyword);
                }
            }
        }
    }

    private static void searchKeyword(File file, String keyword) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = "";
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(file.getAbsolutePath() + " line: " + lineNumber);
                    break;
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}