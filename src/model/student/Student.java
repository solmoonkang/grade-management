package model.student;

import model.course.Course;

import java.util.List;

public class Student {

    private final Long id;
    private final String name;
    private final int grade;
    private final Major major;
    private final Status status;
    private List<Course> courses;

    public Student(Long id,
                   String name,
                   int grade,
                   Major major,
                   Status status,
                   List<Course> courses) {
        this.id = id;
        this.name = validateStudentName(name);
        this.grade = validateStudentGrade(grade);
        this.major = major;
        this.status = validateStudentStatus(status);
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

    public boolean hasSameDepartment(String department) {
        return this.major.equals(Major.getMajorFromString(department));
    }

    public boolean hasSameGrade(int grade) {
        return this.grade == grade;
    }

    private String validateStudentName(String name) {
        if (!name.matches("\\p{L}+")) {
            throw new IllegalArgumentException("[ERROR] Student name should only contain letters.");
        }
        return name;
    }

    private int validateStudentGrade(int grade) {
        if (grade < 1 || grade > 5) {
            throw new IllegalArgumentException("[ERROR] Student grade should be between 1 and 5.");
        }
        return grade;
    }

    private Status validateStudentStatus(Status status) {
        if (!status.isValidStatus()) {
            throw new IllegalArgumentException("[ERROR] The status must be either 'ENROLLED', 'ATTENDING', or 'LEAVE OF ABSENCE'.");
        }
        return status;
    }
}