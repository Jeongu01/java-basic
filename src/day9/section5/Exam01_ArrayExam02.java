package day9.section5;

public class Exam01_ArrayExam02 {

  public static void main(String[] args) {
    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 100) + 1;
    }

    for (int element : arr) {
      System.out.print(element + " ");
    }
  }
}
