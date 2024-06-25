package day9.section5;

public class Exam03_Prob11 {

  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {1, 2, 3, 4, 5};
    int[] c = {2, 2, 3, 4, 5};

    Exam03_Prob11 exam03Prob11 = new Exam03_Prob11();
    if (exam03Prob11.equalsArray(a, b)) {
      System.out.println("two array equals");
    } else {
      System.out.println("two array not-equals");
    }

    System.out.println("======================");

    if (exam03Prob11.equalsArray(a, c)) {
      System.out.println("two array equals");
    } else {
      System.out.println("two array not-equals");
    }
  }

  public boolean equalsArray(int[] a, int[] b) {
    boolean result = true;
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        result = false;
      }
    }

    return result;
  }

}
