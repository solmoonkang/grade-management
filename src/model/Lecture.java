package model;

public class Lecture {

    private final String name;
    private final String professor;
    private final String type;
    private final String schedule;


    public Lecture(String name,
                   String professor,
                   String type,
                   String schedule) {
        this.name = name;
        this.professor = professor;
        this.type = type;
        this.schedule = schedule;
    }
}