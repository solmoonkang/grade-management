package model;

public class Course {

    private final String name;
    private final int credits;
    private final double score;

    public Course(String name,
                  int credits,
                  double score) {
        this.name = name;
        this.credits = credits;
        this.score = score;
    }
}
