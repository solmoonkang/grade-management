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

    // TODO: 서로 중복되는 로직에 대한 이슈를 해결해줘야 한다.
    public boolean hasSameName(Lecture lecture) {
        return this.name.equals(lecture.name);
    }

    public boolean hasSameName(String name) {
        return this.name.equals(name);
    }

    public boolean hasSameProfessor(String professor) {
        return this.professor.equals(professor);
    }
}