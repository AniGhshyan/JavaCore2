package Homework.education;

import java.util.Scanner;

public class StudentLessonTest {
    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";

    private static void printCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for Exit");
        System.out.println("please input " + ADD_LESSON + " for lessons");
        System.out.println("please input " + ADD_STUDENT + " for student");
        System.out.println("please input " + PRINT_STUDENTS + " for print student");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lesson");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for delete lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email" + "\u001B[0m");
    }

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.err.println("Invalid command");
            }
        }
    }

    private static void deleteStudentByEmail() {
        System.out.println("Please choose student's email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.deletStudent(student);
        } else {
            System.out.println("Student does not exists");
        }
    }

    private static void deleteLessonByName() {
        System.out.println("Please choose lesson's name");
        String name = scanner.nextLine();
        if (lessonStorage.getByLessonName(name) != null) {
            lessonStorage.deleteByName(name);
        } else {
            System.out.println("Lesson does not exists");
        }
    }

    private static void printStudentByLesson() {
        System.out.println("Please choose lesson name");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonName);
        if (lesson != null) {
            studentStorage.printStudentByLesson(lesson);
        } else {
            System.err.println("Invalid lesson");
        }
    }

    private static void addStudent() {
        System.out.println("please input email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student == null) {
            System.out.println("please input student's name");
            String name = scanner.nextLine();
            System.out.println("please input student's surname");
            String surname = scanner.nextLine();
            System.out.println("please input student's age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please input student's phone");
            String phone = scanner.nextLine();
            lessonStorage.print();
            System.out.println("Please choose lesson's name! name1,name2,name3,....");
            String lessonNameStr = scanner.nextLine();
            String[] lessonName = lessonNameStr.split(",");
            Lesson[] lessons = new Lesson[lessonName.length];
            for (int i = 0; i < lessonName.length; i++) {
                Lesson lesson = lessonStorage.getByLessonName(lessonName[i]);
                if (lesson != null) {
                    lessons[i] = lesson;
                } else {
                    System.out.println("invalid lesson");
                }
            }
            Student student1 = new Student(name, surname, age, email, phone, lessons);
            studentStorage.add(student1);
        } else {
            System.err.println("Invalid email! Please try again");
            addStudent();
        }

    }

    private static void addLesson() {
        System.out.println("please input lesson's name");
        String name = scanner.nextLine();
        System.out.println("please input lesson's duration");
        String duration = scanner.nextLine();
        System.out.println("please input lesson's lecturar name");
        String lecturarName = scanner.nextLine();
        System.out.println("please input lesson's price");
        int price = Integer.parseInt(scanner.nextLine());
        Lesson lesson = new Lesson(name, duration, lecturarName, price);
        lessonStorage.addLesson(lesson);
        System.out.println("Thank you, lesson was added");

    }
}
