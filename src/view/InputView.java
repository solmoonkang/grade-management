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

    public String inputStudentInfo() throws IOException {
        System.out.println("추가하고 싶은 학생의 학번, 이름, 성별, 성적을 입력해주세요.(입력 형식: [학번 이름 성별 성적])");
        System.out.println("학생들을 더 추가할 경우 ','를 통해서 구분해주세요.(입력 형식: [학생 1], [학생 2], [학생 3], ...)");
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
