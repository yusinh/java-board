package org.example.base;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CommonUtil {
    private Scanner scan = new Scanner(System.in);

    public Scanner getScanner() {
        return scan;
    }

    // 모든 곳에서 자주 사용되는 것은 여기에 모아두는 것이 좋다.
    public String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDate = now.format(formatter);

        return formattedDate;
    }

}
