package day9.section5;

public class Exam03_Prob2 {

  public static void main(String[] args) {
    int[] arr = new int[10];
    Exam03_Prob2 exam03Prob2 = new Exam03_Prob2();
    arr = exam03Prob2.generateRandom();

    System.out.println("<< 생성된 난수 >>");
    for (int element : arr) {
      System.out.print(element + ", ");
    }
    System.out.println("===================");
    System.out.println("배열에서 가장 큰 숫자 : " + exam03Prob2.getMaxNum(arr));
  }

  private int getMaxNum(int[] arr) {
    int max = 0;
    for (int element : arr) {
      max = Math.max(max, element);
    }
    return max;
  }

  public int[] generateRandom() {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 30) + 1;
    }
    return arr;
  }
}
