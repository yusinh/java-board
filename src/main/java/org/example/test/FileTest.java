package org.example.test;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.base.CommonUtil;
import org.example.domain.Article;
import java.io.IOException;


public class FileTest {
    public static void main(String[] args) {
        CommonUtil commonUtil = new CommonUtil();

        Article a1 = new Article(1, "안녕하세요 반갑습니다. 자바 공부중이에요.", "자바 너무 재밌어요!!", commonUtil.getCurrentDateTime(), 0);

        // ObjectMapper 생성
        ObjectMapper mapper = new ObjectMapper();

        try {
            // 객체를 JSON 문자열로 변환하여 파일에 저장
            mapper.writeValue(new File("article.json"), a1);
            System.out.println("객체가 JSON 형태로 파일에 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write() {
        try {
            // PrintWriter를 사용하여 파일에 쓰기
            PrintWriter writer = new PrintWriter("example.txt");

            // 파일에 쓸 내용 작성
            writer.println("Hello, Java 파일 저장 예제입니다.");
            writer.println("이것은 두 번째 줄입니다.");

            // PrintWriter 닫기 (파일을 안전하게 닫음)
            writer.close();

            System.out.println("파일이 성공적으로 저장되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 생성할 수 없습니다.");
            e.printStackTrace();
        }
    }
    public static void read() {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: ");
        }
    }
}
