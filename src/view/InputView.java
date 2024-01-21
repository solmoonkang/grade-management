package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String selectMenu() throws IOException {
        System.out.println("1: 학생 추가, 2: 학생 삭제, 3: 학생 검색, 4: 성적 평균 확인");
        return reader.readLine();
    }

    public String inputStudentIdToAdd() throws IOException {
        System.out.println("추가하고 싶은 학생의 학번을 입력해주세요.");
        return reader.readLine();
    }

    public String inputStudentNameToAdd() throws IOException {
        System.out.println("추가하고 싶은 학생의 이름을 입력해주세요.");
        return reader.readLine();
    }

    public String inputStudentGenderToAdd() throws IOException {
        System.out.println("추가하고 싶은 학생의 성별을 입력해주세요.");
        return reader.readLine();
    }

    public String inputStudentIdToRemove() throws IOException {
        System.out.println("삭제하고 싶은 학생의 학번을 입력해주세요.");
        return reader.readLine();
    }

    public String inputSearchCondition() throws IOException {
        System.out.println("검색하고 싶은 학생의 학번 또는 이름을 입력해주세요.");
        return reader.readLine();
    }

    public String inputExitCommand() throws IOException {
        System.out.println("종료를 원하시면, '종료'를 입력해주세요.");
        return reader.readLine();
    }
}
