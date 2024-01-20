package model.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Students {

    private static final String SPACE = " ";
    private static final String COMMA = ",";

    private final List<Student> students;

    public Students() {
        this.students = new ArrayList<>();
    }

    public void parseMultipleStudentInfo(String studentInfos) {
        students.addAll(Arrays.stream(studentInfos.split(COMMA))
                .map(String::trim)
                .map(this::parseStudentInfo)
                .toList());
    }

    public void removeStudentById(Long id) {
        students.removeIf(student -> student.isIdMatched(id));
    }

    private Student parseStudentInfo(String studentInfo) {
        String[] infos = studentInfo.split(SPACE);
        Long id = Long.parseLong(infos[0]);
        String name = infos[1];
        String gender = infos[2];
        Grade grade = Grade.valueOf(infos[3].toUpperCase());

        return new Student(id, name, gender, grade);
    }

    private List<Student> searchByName(String name) {
        return students.stream()
                .filter(student -> student.isNameMatched(name))
                .collect(Collectors.toList());
    }

    private boolean isNumeric(String userInput) {
        return userInput.matches("\\d+");
    }
}
