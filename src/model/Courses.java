package model;

import java.util.List;

public class Courses {

    private List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
}