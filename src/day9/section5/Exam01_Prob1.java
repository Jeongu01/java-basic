package day9.section5;


public class Exam01_Prob1 {

  public static void main(String[] args) {

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    Exam01_Prob1 prob1 = new Exam01_Prob1();
    System.out.println("( 배열 ia )");
    prob1.printSumOfOddAndEven(ia);
    System.out.println("( 배열 ib )");
    prob1.printSumOfOddAndEven(ib);
  }

  public void printSumOfOddAndEven(int[] arr) {
    int sumOfOdd = 0, sumOfEven = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        // 짝수인 경우
        sumOfEven += arr[i];
      } else {
        sumOfOdd += arr[i];
      }
    }
    System.out.println("홀수의 합 : " + sumOfOdd);
    System.out.println("짝수의 합 : " + sumOfEven);
  }

}
