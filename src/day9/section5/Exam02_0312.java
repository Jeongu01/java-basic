package day9.section5;

public class Exam02_0312 {

  public static void main(String[] args) {
    int[] arr = {10, 30, 20, 80, 50};

    int total = 0;
    double percent;
    for (int element : arr) {
      total += element;
    }

    for (int element : arr) {
      for (int i = 0; i < element * 100 / total; i++) {
        System.out.print("*");
      }
      percent = (double) element / total * 100;
      System.out.println("(" + percent + "%)");
    }
  }

}
