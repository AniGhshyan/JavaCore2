package Homework.education;

public class StudentStorage {
    private Student[] students = new Student[10];
    private Lesson[] lessons = new Lesson[3];
    private int size = 0;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, size);
        tmp = students;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void printStudentByLesson(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(lesson)) {
                System.out.println(students[i]);
            }
        }
    }

    public void deletStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                for (int j = i + 1; j < size; j++) {
                    students[j - 1] = students[j];
                }
                size--;
            }
        }
    }

}

