package model.lecture;

import model.course.Type;

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

    public List<Lecture> findLectureByType(String type) {
        Type inputType = Type.fromString(type);

        return lectures.stream()
                .filter(lecture -> lecture.hasSameType(inputType))
                .collect(Collectors.toList());
    }

    public void updateLecture(Lecture newLecture) {
        Lecture lecture = lectures.stream()
                .filter(existingLecture -> existingLecture.hasSameName(newLecture))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] Lecture not found with name"));

        isDuplicatedNameExceptSelf(lecture, newLecture);
        lecture.updateLecture(newLecture);
    }

    public void removeLecture(String name) {
        Lecture lecture = lectures.stream()
                .filter(existingLecture -> existingLecture.hasSameName(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] Lecture not found with name"));

        lectures.remove(lecture);
    }

    private void isDuplicatedName(Lecture newLecture) {
        if (lectures.stream().anyMatch(lecture -> lecture.hasSameName(newLecture))) {
            throw new IllegalArgumentException("[ERROR] Lecture Name is Duplicated.");
        }
    }

    // TODO: 중복되는 로직들에 대한 정리가 필요
    private void isDuplicatedNameExceptSelf(Lecture existLecture, Lecture newLecture) {
        if (lectures.stream().anyMatch(lecture -> !lecture.equals(existLecture) && lecture.hasSameName(newLecture))) {
            throw new IllegalArgumentException("[ERROR] Lecture Name is Duplicated.");
        }
    }
}