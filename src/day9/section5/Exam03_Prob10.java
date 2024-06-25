package day9.section5;

public class Exam03_Prob10 {

  public static void main(String[] args) {
    int[][] a = {
        {30, 30, 30, 30},
        {40, 40, 40, 40},
        {50, 50, 50, 50}
    };

    int[][] b = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };

    int c[][] = new int[3][4];

    Exam03_Prob10 exam03Prob10 = new Exam03_Prob10();
    exam03Prob10.sub(a, b, c);
    exam03Prob10.prn(c);
  }

  public int[][] sub(int[][] a, int[][] b, int[][] c) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        c[i][j] = a[i][j] - b[i][j];
      }
    }
    return c;
  }

  public void prn(int[][] c) {
    for (int[] col : c) {
      for (int element : col) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }


}
