package day9.section5;

public class Exam03_Prob7 {

  public static void main(String[] args) {
    Exam03_Prob7 exam03Prob7 = new Exam03_Prob7();
    int[] arr = {10, 30, 20, 80, 50};
    exam03Prob7.calculate(arr);
  }

  void calculate(int[] nums) {
    int total = 0;
    double percent;
    for (int num : nums) {
      total += num;
    }

    for (int num : nums) {
      for (int i = 0; i < num * 100 / total; i++) {
        System.out.print("*");
      }
      percent = (double) num / total * 100;
      System.out.println(" (" + Math.round(percent * 10.0) / 10.0 + "%)");
    }
  }
}
