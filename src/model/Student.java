package model;

import java.util.List;

public class Student {

    private final Long id;
    private final String name;
    private final int grade;
    private final Major major;
    private final Status status;
    private List<Course> courses;

    public Student(Long id,
                   String name,
                   int grade,
                   Major major,
                   Status status,
                   List<Course> courses) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        // TODO: Major 필드에 대한 유효성 검사도 추가할 수 있습니다. 메서드가 잘못된 문자열을 입력받는 경우 어떻게 처리할지 고려해보자.
        this.major = major;
        this.status = validateStatus(status);
        this.courses = courses;
    }

    public boolean hasSameIdWithStudent(Student student) {
        return this.id.equals(student.id);
    }

    public boolean hasSameId(Long id) {
        return this.id.equals(id);
    }

    // TODO: hasSameName, hasSameDepartment, hasSameGrade 메서드는 equals 메서드를 오버라이드하여 하나의 메서드로 합칠 수 있다.
    public boolean hasSameName(String name) {
        return this.name.equals(name);
    }

    public boolean hasSameDepartment(String department) {
        return this.major.equals(Major.getMajorFromString(department));
    }

    public boolean hasSameGrade(int grade) {
        return this.grade == grade;
    }

    private Status validateStatus(Status status) {
        if (!status.isEnrolled() && !status.isAttending() && !status.isLeaveOfAbsence()) {
            throw new IllegalArgumentException("The status must be either 'ENROLLED', 'ATTENDING', or 'LEAVEOFABSENCE'.");
        }
        return status;
    }
}