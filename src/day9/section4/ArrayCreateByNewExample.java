package day9.section4;

import java.util.Scanner;

public class ArrayCreateByNewExample {

  public static void main(String[] args) {
    //1. 정수형 배열 변수 arr1을 길이가 3인 배열로 생성하세요
    int[] arr1 = new int[3];

    //배열 항목의 초기값 출력
    for (int i : arr1) {
      System.out.println(i);
    }

    //Scanner 클래스를 이용하여 arr1에 10, 20, 30 값을 차례로 입력하고 출력하는 프로그램 작성
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      int input = scanner.nextInt();
      arr1[i] = input;
    }
    for (int i : arr1) {
      System.out.println(i);
    }

    String[] str = new String[4];
    str[0] = "봄";
    str[1] = "여름";
    str[2] = "가을";
    str[3] = "겨울";
    // enhanced for 이용하여 str 배열의 값 출력하세요

    for (String s : str) {
      System.out.println(s);
    }

    str[2] = str[3];
    for (String s : str) {
      System.out.println(s);
    }
  }
}
