package model.course;

import model.lecture.Lecture;

public class Course {

    private final Lecture lecture;
    private final int credits;
    private final double score;

    public Course(Lecture lecture,
                  int credits,
                  double score) {
        this.lecture = lecture;
        this.credits = credits;
        this.score = score;
    }
}