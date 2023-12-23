package model;

public enum Major {

    COMPUTER("컴퓨터공학과", "자연계열"),
    LAW("법학과", "인문계열"),
    BUSINESS("경영학과", "사회계열"),
    PSYCHOLOGY("심리학과", "사회계열"),
    BIOLOGY("생물학과", "자연계열"),
    MUSIC("음악학과", "예체능계열");

    private final String department;
    private final String division;

    Major(String department,
          String division) {
        this.department = department;
        this.division = division;
    }
}