package model.lecture;

import java.util.List;

public class Lectures {

    private List<Lecture> lectures;

    public Lectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public void addLecture(Lecture lecture) {
        isDuplicatedName(lecture);
        lectures.add(lecture);
    }

    private void isDuplicatedName(Lecture newLecture) {
        if (lectures.stream().anyMatch(lecture -> lecture.hasSameName(newLecture))) {
            throw new IllegalArgumentException("[ERROR] Lecture Name is Duplicated.");
        }
    }
}