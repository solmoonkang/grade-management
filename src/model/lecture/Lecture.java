package model.lecture;

import model.course.Type;

public class Lecture {

    private String name;
    private String professor;
    private Type type;
    private String schedule;


    public Lecture(String name,
                   String professor,
                   String type,
                   String schedule) {
        this.name = name;
        this.professor = professor;
        this.type = Type.fromString(type);
        this.schedule = schedule;
    }

    public boolean hasSameName(Lecture lecture) {
        return this.name.equals(lecture.name);
    }

    public boolean hasSameName(String name) {
        return this.name.equals(name);
    }

    public boolean hasSameProfessor(String professor) {
        return this.professor.equals(professor);
    }

    public boolean hasSameType(Type type) {
        return this.type.equals(type);
    }

    public void updateLecture(Lecture newLecture) {
        this.name = newLecture.name;
        this.professor = newLecture.professor;
        this.type = newLecture.type;
    }
}