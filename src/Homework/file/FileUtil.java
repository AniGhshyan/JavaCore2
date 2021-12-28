package Homework.file;

import java.io.*;

public class FileUtil {
    public void findLines(String txtPath, String keyword) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void printSizeOfPackage(String path) {
        File file = new File(path);
        double size = 0;
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                size += listFile.length();
                size = size / 1024;

            }
            System.out.println(size);
        }
    }

    public void createFileWithContent(String path, String filename, String content) {
        File file = new File(path);
        file.mkdir();
        File file1 = new File(filename);
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        write(filename, content);

    }

    private void write(String filename, String content) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
