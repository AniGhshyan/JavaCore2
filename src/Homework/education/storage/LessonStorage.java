package Homework.education.storage;

import Homework.education.model.Lesson;

import java.util.HashMap;
import java.util.LinkedList;

public class LessonStorage {
    private LinkedList<Lesson> lessons = new LinkedList<>();

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public void print() {
        for (Lesson lesson : lessons) {
            System.out.println(lesson);
        }
    }

    public Lesson getByLessonName(String lessonName) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(lessonName)) {
                return lesson;
            }
        }
        return null;
    }

    public void deleteByName(String name) {

        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(name)) {
                lessons.remove(lesson);
            }
        }
    }
}

