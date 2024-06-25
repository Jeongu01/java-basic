package day9.section5;

public class Exam03_Prob5 {

  public static int getValue(int[] values, boolean isMax) {

    // int 타입 배열의 최대값 또는 최소값을 리턴한다.
    int value = values[0];

    if (isMax) {
      for (int i = 1; i < values.length; i++) {
        value = Math.max(value, values[i]);
      }
    } else {
      for (int i = 1; i < values.length; i++) {
        value = Math.min(value, values[i]);
      }
    }

    return value;
  }

  public static void main(String[] args) {
    int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

    int maxValue = getValue(values, true);
    int minValue = getValue(values, false);

    System.out.println("최대값 = " + maxValue);
    System.out.println("최소값 = " + minValue);

  }

}
