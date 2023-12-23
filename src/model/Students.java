package model;

import java.util.List;

public class Students {

    private final List<Student> students;

    public Students(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        isDuplicatedId(student);
        this.students.add(student);
    }

    private void isDuplicatedId(Student student) {
        if (students.stream().anyMatch(existingStudent -> existingStudent.hasSameId(student))) {
            throw new IllegalArgumentException("The student id is duplicated.");
        }
    }
}