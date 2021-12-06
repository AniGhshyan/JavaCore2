package Homework.education.model;

import Homework.education.util.DateUtil;

import java.util.Arrays;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;
    private Lesson[] lessons;
    private Date registeredDate;

    public Student(String name, String surname, int age, String email, String phone, Lesson[] lessons, Date date) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.lessons = lessons;
        this.registeredDate = date;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson[] lesson) {
        this.lessons = lessons;
    }

    public Date getDate() {
        return registeredDate;
    }

    public void setDate(Date date) {
        this.registeredDate = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
        if (email != null ? !email.equals(student.email) : student.email != null) return false;
        if (phone != null ? !phone.equals(student.phone) : student.phone != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(lessons, student.lessons)) return false;
        return registeredDate != null ? registeredDate.equals(student.registeredDate) : student.registeredDate == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lessons);
        result = 31 * result + (registeredDate != null ? registeredDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", lessons=" + Arrays.toString(lessons) +
                ", date=" + DateUtil.dateToString(registeredDate) + '}';
    }
}