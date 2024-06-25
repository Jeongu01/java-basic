package day9.section5;

public class Exam03_Prob12 {

  public static void main(String[] args) {
    Exam03_Prob12 exam03Prob12 = new Exam03_Prob12();
    int[] inputNumbers = {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
    int[] result = new int[inputNumbers.length];
    result = exam03Prob12.ascending(inputNumbers);
    for (int e : result) {
      System.out.print(e + " ");
    }
  }

  public int[] ascending(int[] inputNumbers) {
    // implements ascending method.
    for (int i = 0; i < inputNumbers.length; i++) {
      for (int j = 0; j < inputNumbers.length - 1; j++) {
        if (inputNumbers[j] > inputNumbers[j + 1]) {
          int temp = inputNumbers[j];
          inputNumbers[j] = inputNumbers[j + 1];
          inputNumbers[j + 1] = temp;
        }
      }
    }
    
    return inputNumbers;
  }
}
