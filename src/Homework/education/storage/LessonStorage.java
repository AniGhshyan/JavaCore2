package Homework.education.storage;

import Homework.education.model.Lesson;
import Homework.education.util.FileUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LessonStorage {
    private
    List<Lesson> lessons = new ArrayList<>();

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
        serialize();
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
                serialize();
            }
        }
    }

    private void serialize() {
        FileUtil.serializeLessons(lessons);
    }

    public void initData() {
        List<Lesson> lessonList = FileUtil.deSerializeLessons();
        if (lessonList != null) {
            lessons = lessonList;
        }
    }
}

