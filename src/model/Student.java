package model;

import java.util.List;

public class Student {

    private final Long id;
    private final String name;
    private final int grade;
    private final Major major;
    private final List<Course> courses;

    public Student(Long id,
                   String name,
                   int grade,
                   Major major,
                   List<Course> courses) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.major = major;
        this.courses = courses;
    }

    public boolean hasSameIdWithStudent(Student student) {
        return this.id.equals(student.id);
    }

    public boolean hasSameId(Long id) {
        return this.id.equals(id);
    }

    public boolean hasSameName(String name) {
        return this.name.equals(name);
    }
}