package Homework.education;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[10];
    private int size = 0;

    public void addLesson(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, size);
        lessons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public Lesson getByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(lessonName)) {
                return lessons[i];
            }
        }
        return null;
    }

//    public Lesson lesson(String lesson) {
//        for (int i = 0; i < size; i++) {
//            if (lessons[i].getName().equals(lesson)) {
//                return lessons[i];
//            }
//        }
//        return null;
//    }

    public void deleteByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                for (int j = i + 1; j < size; j++) {
                    lessons[j - 1] = lessons[j];
                }
                size--;
            }

        }
    }

}
