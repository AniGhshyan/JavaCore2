package Homework.education.storage;

import Homework.education.model.Lesson;
import Homework.education.model.Student;

import java.util.LinkedList;

public class StudentStorage {
    private LinkedList<Student> students = new LinkedList<>();
    private LinkedList<Lesson> lessons = new LinkedList<>();

    public void add(Student student) {
        students.add(student);
    }

    public void print() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student getByEmail(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                return student;
            }
        }
        return null;
    }

    public void printStudentByLesson(Lesson lesson) {
        for (Student student : students) {
            for (Lesson studentLesson : student.getLessons()) {
                if (studentLesson.equals(lesson)) {
                    System.out.println(student);
                }
            }
        }
    }

    public void deleteStudent(Student student) {
        for (Object o : students.toArray()) {
            if (o.equals(student)) {
                students.remove(o);
            }
        }
//        for (Student student1 : students) {
//            if (student1.equals(student)) {
//                students.remove(student1);
//            }
//        }
    }
}

