package day9.section5;

import java.util.Arrays;
import java.util.LinkedList;

public class Exam03_Prob3 {

  public static void main(String[] args) {
    int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
    System.out.println("<< 중복되지 않은 숫자 >>");
    printUniqueNumber(array);
  }

  private static void printUniqueNumber(int[] array) {
    // 구현하세요.
    LinkedList<Integer> linkedList = new LinkedList<>();
    for (int element : array) {
      if (!linkedList.contains(element)) {
        linkedList.add(element);
      }
    }

    System.out.println("<< 중복되지 않은 숫자 >>");
    for (int i = 0; i < linkedList.size() - 1; i++) {
      System.out.print(linkedList.get(i) + ", ");
    }
    System.out.print(linkedList.get(linkedList.size() - 1));
  }

}
