package day9.section5;

public class Exam02_0422 {

  public static void main(String[] args) {

    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    for (int i = 0; i < alphabet.length; i++) {
      for (int j = 0; j < alphabet[i].length; j++) {
        alphabet[i][j] = (char) (start + i * alphabet.length + j);
      }
    }

    //2.원본 배열 출력
    System.out.println("\t\t\t원본 배열");
    System.out.println("====================="); // '=' 21개
    for (char[] charArr : alphabet) {
      for (char c : charArr) {
        System.out.printf("%-5c", c);
      }
      System.out.println();
    }

    System.out.println();

    //3. 배열 수정
    for (int i = 0; i < alphabet.length; i++) {
      alphabet[i][i] = '*';
    }

    //4. 수정된 배열 출력
    System.out.println("\t\t\t수정된 배열");
    System.out.println("====================="); // '=' 21개
    for (char[] charArr : alphabet) {
      for (char c : charArr) {
        System.out.printf("%-5c", c);
      }
      System.out.println();
    }

  }
}

