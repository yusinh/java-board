package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> titleList = new ArrayList<>();
        ArrayList<String> contentList = new ArrayList<>();
        // 반복 횟수 정할 수 없음 => 무한 반복 구조

        while (true) { // 반복 조건이 true이기 떄문에 무한 반복
            System.out.print("명령어 : ");
            String cmd = scan.nextLine();
            if(cmd.equals("exit")) { // 숫자가 아닌 경우 같다라는 표현을 할 때 == 이 아닌 .equals()를 사용해야 한다.
                System.out.print("프로그램을 종료합니다.");
                break; // 반복문 탈출
            }
            else if(cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = scan.nextLine();
                titleList.add(title);
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = scan.nextLine();
                System.out.println("게시물이 등록되었습니다.");
                contentList.add(content);
            }
            else if(cmd.equals("list")) {
                System.out.println("==================");
                for (int i = 0; i < titleList.size(); i++) {
                    System.out.println("번호 : " + (i + 1));
                    System.out.println("제목 : " + titleList.get(i));
//                    System.out.println("내용 : " + contentList.get(i));
                    System.out.println("==================");
                }
            }
            else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int number = Integer.parseInt(scan.nextLine());
                if (number > titleList.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                }
                else {
                    System.out.print("제목 : ");
                    String title = scan.nextLine();
                    titleList.set((number - 1), title);

                    System.out.print("내용 : ");
                    String content = scan.nextLine();
                    contentList.set((number - 1), content);

                    System.out.print(number + "번 게시물이 수정되었습니다.\n");
                }
            }
            else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int number = Integer.parseInt(scan.nextLine());
                if (number > titleList.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                }
                else {
                    System.out.print(number + "번 게시물이 삭제되었습니다.\n");
                }
            }

        }

        // 1. 반복문 제어 하던 방법 : 반복 횟수 세서 특정 횟수 지나면 탈출
        // 2. break문을 사용하여 강제 탈출 가능




    }
}