package model.student;

import java.util.ArrayList;
import java.util.List;

public class Students {

    private static final String SPACE = " ";
    private static final String COMMA = ",";

    private final List<Student> students;

    public Students() {
        this.students = new ArrayList<>();
    }

    public void parseMultipleStudentInfo(String studentInfos) {
        String[] individualInfo = studentInfos.split(COMMA);

        for (String info : individualInfo) {
            parseStudentInfo(info.trim());
        }
    }

    private void parseStudentInfo(String studentInfo) {
        String[] infos = studentInfo.split(SPACE);
        Long id = Long.parseLong(infos[0]);
        String name = infos[1];
        String gender = infos[2];
        Grade grade = Grade.valueOf(infos[3].toUpperCase());

        Student student = new Student(id, name, gender, grade);
        students.add(student);
    }
}
