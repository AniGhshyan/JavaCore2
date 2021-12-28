package Homework.file;

import java.util.Scanner;

public class FileUtilTest {
    static Scanner scanner = new Scanner(System.in);
    static FileUtil fileUtil = new FileUtil();


    public static void main(String[] args) {
//        System.out.println("Please input fine path ");
//        String fileName = scanner.nextLine();
//        System.out.println("Please input keyword");
//        String keyword = scanner.nextLine();
//        fileUtil.findLines(fileName, keyword);
//        System.out.println("Please input package path ");
//        String packagePath = scanner.nextLine();
//        fileUtil.printSizeOfPackage(packagePath);
        System.out.println("Please input package name");
        String packageName = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        fileUtil.createFileWithContent(packageName, fileName, content);
    }
}
