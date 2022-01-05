package Homework.education.util;

import Homework.education.model.Lesson;
import Homework.education.model.Student;
import Homework.education.model.User;

import javax.imageio.IIOException;
import java.io.*;
import java.util.List;
import java.util.Map;

public class FileUtil {
    private static final String DATA_PATH = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\Homework\\education\\data";

    public static void serializeLessons(List<Lesson> lessonList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\lessons.dat"))) {
            out.writeObject(lessonList);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void serializeStudents(List<Student> studentList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\students.dat"))) {
            out.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void serializeUserMap(Map<String, User> userMap) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\users.dat"))) {
            out.writeObject(userMap);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static List<Lesson> deSerializeLessons() {
        File lessonFile = new File(DATA_PATH + "\\lessons.dat");
        if (!lessonFile.exists()) {
            try {
                lessonFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(lessonFile))) {
                Object obj = in.readObject();
                return (List<Lesson>) obj;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static List<Student> deSerializeStudents() {
        File studentFile = new File(DATA_PATH + "\\students.dat");
        if (!studentFile.exists()) {
            try {
                studentFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(studentFile))) {
                Object obj = in.readObject();
                return (List<Student>) obj;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Map<String, User> deSerializeUserMap() {
        File userFile = new File(DATA_PATH + "users.dat");
        if (!userFile.exists()) {
            try {
                userFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(userFile))) {
                Object obj = in.readObject();
                return (Map<String, User>) obj;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}

