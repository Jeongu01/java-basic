package day9.section5;

public class Exam03_Prob13 {

  public static void main(String[] args) {

    char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    Exam03_Prob13 exam03Prob13 = new Exam03_Prob13();
    System.out.println(exam03Prob13.reverseString(s, 0, 3));
    System.out.println(exam03Prob13.reverseString(s, 4, 7));
    System.out.println(exam03Prob13.reverseString(s, 8, 10));
    System.out.println(exam03Prob13.reverseString(s, 0, 10));

  }

  public char[] reverseString(char[] s, int start, int end) {
    char[] result = new char[end - start + 1];

    int index = 0;
    for (int i = end; i >= start; i--) {
      result[index++] = s[i];
    }

    return result;
  }

}
