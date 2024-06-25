package day9.section5;

import java.util.Scanner;

public class MultidimensionalArrayByNewExample {

  public static void main(String[] args) {
    // 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
    int[][] engScores = new int[2][3];

    // 배열 항목 초기값 출력 (for) 이용
    for (int i = 0; i < engScores.length; i++) {
      for (int j = 0; j < engScores[i].length; j++) {
        System.out.println("engScores[" + i + "][" + j + "] = " + engScores[i][j] + " ");
      }
    }

    System.out.println();
    // engScores 배열의 점수를 입력받아 항목 값을 변경한 후 변경값을 출력하세요
    Scanner scanner = new Scanner(System.in);

    int total = 0, studentNum = 0;
    double avg = 0;

    for (int i = 0; i < engScores.length; i++) {
      studentNum += engScores[i].length;
      for (int j = 0; j < engScores[i].length; j++) {
        System.out.print("한 명의 영어점수 입력: ");
        int eng = scanner.nextInt();
        engScores[i][j] = eng;
        total += eng;
        System.out.println("engScores[" + i + "][" + j + "] = " + engScores[i][j]);
      }
    }

    // 전체 학생의 영어 평균 구하기
    avg = (double) total / studentNum;
    System.out.println("전체 학생의 영어 평균 점수 : " + avg);

    // 각 반의 학생 수가 다를 경우 수학 점수 저장을 위한 2차원 배열 생성 조건: 전체반은 3반이다. 1반, 2반, 3반
    int[][] mathScores = new int[3][];

    int stuNum = 0;

    // 1반은 학생수 5명, 2반은 3명, 3반은 10명이다. 각 반의 학생수를 입력받아 조건에 맞도록 셋팅해서 초기값을 출력하세요.
    for (int i = 0; i < mathScores.length; i++) {
      System.out.print((i + 1) + "반의 학생 수를 입력해주세요: ");
      stuNum = scanner.nextInt();
      mathScores[i] = new int[stuNum];
      for (int j = 0; j < stuNum; j++) {
        System.out.print((i + 1) + "반의 학생들의 수학 점수를 입력해주세요: ");
        mathScores[i][j] = scanner.nextInt();
        System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
      }
    }

    System.out.println();
    // 배열 항목 값 변경

    // 전체 학생의 영어 평균 구하기

  }
}
