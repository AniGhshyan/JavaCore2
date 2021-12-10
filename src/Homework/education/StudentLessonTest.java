package Homework.education;

import Homework.education.model.Lesson;
import Homework.education.model.Student;
import Homework.education.model.User;
import Homework.education.storage.LessonStorage;
import Homework.education.storage.StudentStorage;
import Homework.education.storage.UserStorage;
import Homework.education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class StudentLessonTest implements StudentLessonCommand {
    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static UserStorage userStorage = new UserStorage();

    public static void main(String[] args) throws ParseException {
        User user = new User("Poxos", "Poxosyan", "poxos@mail.ru", "poxos", "user");
        User user1 = new User("Poxosuhi", "Poxosyan", "poxosuhi@mail.ru", "poxosuhi", "admin");
        userStorage.addUser(user);
        userStorage.addUser(user1);

        boolean isRun = true;
        while (isRun) {
            UserCommands.printCommans1();
            String command = scanner.nextLine();
            switch (command) {
                case UserCommands.EXIT:
                    isRun = false;
                    break;
                case UserCommands.LOGIN:
                    login();
                    break;
                case UserCommands.REGISTER:
                    uresRegister();
                    break;
                case UserCommands.PRINT_USER:
                    userStorage.print();
                    break;
                default:
                    System.err.println("invalid commands");
            }
        }
    }

    private static void uresRegister() {
        System.out.println("Please input user's email");
        String email = scanner.nextLine();
        User user = userStorage.getByEmail(email);
        if (user == null) {
            System.out.println("Please input user's password");
            String password = scanner.nextLine();
            if (user.getPassword().equals(password)) {
                System.out.println("Please input user's name");
                String name = scanner.nextLine();
                System.out.println("Please input user's surname");
                String surname = scanner.nextLine();
                System.out.println("Please input user's type(uzer or admin)");
                String type = scanner.nextLine();
                User user1 = new User(name, surname, email, password, type);
                userStorage.addUser(user1);
                System.out.println("Thank you user was added");
            }
        } else {
            System.out.println("invalid user,try again");
            uresRegister();
        }
    }

    private static void login() throws ParseException {
        System.out.println("Please choose user's email");
        String email = scanner.nextLine();
        User user = userStorage.getByEmail(email);
        if (user == null) {
            System.out.println("Invalid email");
        } else {
            System.out.println("Please choose user's password");
            String password = scanner.nextLine();
            if (user.getPassword().equals(password)) {
                if (user.getType().equals("user")) {
                    userCommands();
                } else if (user.getType().equals("admin")) {
                    adminCommands();
                }
            } else {
                System.out.println(email);
                System.err.println("Invalid password");
                System.out.println("\033[0;31m"+"Please try again"+  "\u001B[0m");
                login();
            }
        }
    }

    private static void adminCommands() throws ParseException {
        boolean isRun1 = true;
        while (isRun1) {
            StudentLessonCommand.printAdminCommands();
            String command1 = scanner.nextLine();
            switch (command1) {
                case EXIT:
                    isRun1 = false;
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
                    break;
            }
        }
    }

    private static void userCommands() throws ParseException {
        boolean isRun2 = true;
        while (isRun2) {
            StudentLessonCommand.printUsedrCommands();
            String command2 = scanner.nextLine();
            switch (command2) {
                case EXIT:
                    isRun2 = false;
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
                default:
                    System.err.println("Invalid command");
                    break;
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
        System.out.println("Please choose lessons name! name1,name2,...");
        String lessonsName = scanner.nextLine();
        String[] lessonArray = lessonsName.split(",");
        if (lessonArray.length == 0) {
            System.out.println("Please choose lesson's name");
            return;
        }
        Lesson[] lessons = new Lesson[lessonArray.length];
        int index = 0;
        for (String lesson : lessonArray) {
            Lesson lessonName = lessonStorage.getByLessonName(lesson);
            if (lessonName != null) {
                lessons[index++] = lessonName;
            } else {
                System.out.println("Invalid lesson's name");
                return;
            }
            studentStorage.printStudentByLesson(lessonName);
        }
    }

    private static void addStudent() throws ParseException {
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
            System.out.println("please input student's date of birth[12/12/2021]");
            String dateStr = scanner.nextLine();
            Date date = DateUtil.stringToDate(dateStr);

            lessonStorage.print();
            System.out.println("Please choose lesson's name! name1,name2,name3,....");
            String lessonNameStr = scanner.nextLine();
            String[] lessonName = lessonNameStr.split(",");
            if (lessonName.length == 0) {
                System.out.println("please choose lessons's name");
                return;
            }
            Lesson[] lessons = new Lesson[lessonName.length];
            for (int i = 0; i < lessonName.length; i++) {
                Lesson lesson = lessonStorage.getByLessonName(lessonName[i]);
                if (lesson != null) {
                    lessons[i] = lesson;
                } else {
                    System.out.println("invalid lesson");
                    return;
                }
            }
            Student student1 = new Student(name, surname, age, email, phone, lessons, date);
            studentStorage.add(student1);
            System.out.println("Thank you,student was added");
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
