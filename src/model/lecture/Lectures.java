package model.lecture;

import java.util.List;
import java.util.stream.Collectors;

public class Lectures {

    private List<Lecture> lectures;

    public Lectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public void addLecture(Lecture lecture) {
        isDuplicatedName(lecture);
        lectures.add(lecture);
    }

    public List<Lecture> findLectureByName(String name) {
        return lectures.stream()
                .filter(lecture -> lecture.hasSameName(name))
                .collect(Collectors.toList());
    }

    public List<Lecture> findLectureByProfessor(String professor) {
        return lectures.stream()
                .filter(lecture -> lecture.hasSameProfessor(professor))
                .collect(Collectors.toList());
    }

    private void isDuplicatedName(Lecture newLecture) {
        if (lectures.stream().anyMatch(lecture -> lecture.hasSameName(newLecture))) {
            throw new IllegalArgumentException("[ERROR] Lecture Name is Duplicated.");
        }
    }
}