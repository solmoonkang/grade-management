package model.student;

public class Student {

    private final Long id;
    private final String name;
    private final String gender;
    private final Grade grade;

    public Student(Long id,
                    String name,
                    String gender,
                    Grade grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }
}