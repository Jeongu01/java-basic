package day12.morningTest;

import java.util.ArrayList;
import java.util.Scanner;

public class RefEx9 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    int stuNum = 0;
    ArrayList<Integer> scores = new ArrayList<>();

    while (!quit) {
      System.out.println("----------------------------------------------------");
      System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
      System.out.println("----------------------------------------------------");
      System.out.print("선택> ");
      int menu = Integer.parseInt(scanner.nextLine());
      switch (menu) {
        case 1:
          System.out.print("학생수> ");
          stuNum = Integer.parseInt(scanner.nextLine());
          if (stuNum <= 0) {
            System.out.println("양의 정수를 입력해주세요.");
          }
          break;
        case 2:
          if (stuNum <= 0) {
            System.out.println("학생 수를 먼저 입력해 주세요.");
          } else {
            for (int i = 0; i < stuNum; i++) {
              System.out.print("scores[" + i + "]>");
              int input = Integer.parseInt(scanner.nextLine());
              scores.add(input);
            }
          }
          break;
        case 3:
          if (scores.isEmpty()) {
            System.out.println("점수를 먼저 입력해 주세요.");
          } else {
            for (int i = 0; i < stuNum; i++) {
              System.out.println("scores[" + i + "]: " + scores.get(i));
            }
          }
          break;
        case 4:
          if (scores.isEmpty()) {
            System.out.println("점수를 먼저 입력해 주세요.");
          } else {
            int max = scores.get(0);
            int sum = 0;
            for (Integer score : scores) {
              max = Math.max(max, score);
              sum += score;
            }
            System.out.println("최고 점수: " + max);
            System.out.println("평균 점수: " + (double) sum / scores.size());
          }
          break;
        case 5:
          System.out.println("프로그램 종료");
          quit = true;
      }
      System.out.println();
    }
  }

}
