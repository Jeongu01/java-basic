package day9.section5;

import java.util.Arrays;

public class Exam03_Prob6 {

  public static void main(String[] args) {
    Exam03_Prob6 median = new Exam03_Prob6();

    int[] values1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
    System.out.println("input : " + Arrays.toString(values1));
    System.out.println("median : " + median.findMedian(values1));
    System.out.println("=================================================");

    int[] values2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
    System.out.println("input : " + Arrays.toString(values2));
    System.out.println("median : " + median.findMedian(values2));
  }

  public int findMedian(int[] values) {

    // 메소드를 완성하세요
    Arrays.sort(values);

    int total = 0;
    double avg;
    for (int value : values) {
      total += value;
    }

    avg = (double) total / values.length;

    int returnValue = 0;
    if (values.length > 1) {
      for (int i = 0; i < values.length - 1; i++) {
        if (Math.abs(values[i] - avg) <= Math.abs(values[i + 1]) - avg) {
          returnValue = values[i];
          break;
        }
      }
    } else {
      returnValue = values[0];
    }

    return returnValue;
  }

}
