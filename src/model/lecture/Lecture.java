package model.lecture;

import model.course.Type;

public class Lecture {

    private final String name;
    private final String professor;
    private final Type type;
    private final String schedule;


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
}