package model.student;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Students {

    private final List<Student> students;

    public Students(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        isDuplicatedId(student);
        this.students.add(student);
    }

    public Optional<Student> findStudentById(Long id) {
        return students.stream()
                .filter(student -> student.hasSameId(id))
                .findFirst();
    }

    public List<Student> findStudentsByName(String name) {
        return students.stream()
                .filter(student -> student.hasSameName(name))
                .collect(Collectors.toList());
    }

    public List<Student> findStudentsByDepartment(String department) {
        return students.stream()
                .filter(student -> student.hasSameDepartment(department))
                .collect(Collectors.toList());
    }

    public List<Student> findStudentsByGrade(int grade) {
        return students.stream()
                .filter(student -> student.hasSameGrade(grade))
                .collect(Collectors.toList());
    }

    private void isDuplicatedId(Student student) {
        if (students.stream().anyMatch(existingStudent -> existingStudent.hasSameIdWithStudent(student))) {
            throw new IllegalArgumentException("[ERROR] The student id is duplicated.");
        }
    }
}