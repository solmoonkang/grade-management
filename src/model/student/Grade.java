package model.student;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Grade {

    A_PLUS("A+", 5.0), A("A", 4.5),
    B_PLUS("B+", 4.0), B("B", 3.5),
    C_PLUS("C+", 3.0), C("C", 2.5),
    D_PLUS("D+", 2.0),
    F("F", 0.0);

    private final String grade;
    private final double score;

    Grade(String grade,
          double score) {
        this.grade = grade;
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    private static boolean isNumeric(String userInput) {
        return userInput != null && userInput.matches("[-+]?\\d*\\.?\\d+");
    }

    private static Grade getGradeByScore(double score) {
        return Stream.of(Grade.values())
                .filter(mark -> mark.score == score)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] Invalid Score: " + score));
    }
}
