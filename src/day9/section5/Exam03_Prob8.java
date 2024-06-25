package day9.section5;

public class Exam03_Prob8 {

  public static void main(String[] args) {
    int[][] arr = new int[5][5];
    int start = 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = arr.length - 1; j >= 0; j--) {
        arr[i][j] = start++;
      }
    }

    for (int[] row : arr) {
      for (int col : row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}
