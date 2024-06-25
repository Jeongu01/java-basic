package day9.section5;


public class Exam03_Prob1 {

  public static void main(String[] args) {

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    Exam03_Prob1 p = new Exam03_Prob1();
    System.out.println("( 배열 ia )");
    p.calc(ia);
    System.out.println("( 배열ib )");
    p.calc(ib);
  }

  public void calc(int[] ix) {

    // 구현하시오.-----------------------------
    int sumOfOdd = 0, sumOfEven = 0;
    for (int i = 0; i < ix.length; i++) {
      if (ix[i] % 2 == 0) {
        // 짝수인 경우
        sumOfEven += ix[i];
      } else {
        sumOfOdd += ix[i];
      }
    }
    System.out.println("홀수의 합 : " + sumOfOdd);
    System.out.println("짝수의 합 : " + sumOfEven);
    //---------------------------------------

  }

}
