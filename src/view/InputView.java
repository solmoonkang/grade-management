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
        System.out.println("추가하고 싶은 학생의 이름, 학번, 성별을 입력해주세요.");
        return reader.readLine();
    }
}
