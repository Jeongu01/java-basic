package day9.section5;

public class MultidimensionalArrayByValueListExample {

  public static void main(String[] args) {
    //2차원 배열 생성
    int[][] scores = {
        {80, 90, 96},
        {76, 88}
    };

    //배열의 길이
    System.out.println("1차원 배열 길이(반의 수) 출력: " + scores.length);
    System.out.println("2차원 배열 길이(첫번째 반의 학생 수) 출력: " + scores[0].length);
    System.out.println("2차원 배열 길이(두번째 반의 학생 수) 출력: " + scores[1].length);

    //첫번째 반의 세번째 학생의 점수 읽어서 출력하세요
    System.out.println("첫번째 반의 세번째 학생의 점수: " + scores[0][2]);

    //두번째 반의 두번째 학생의 점수 읽어서 출력하세요
    System.out.println("두번째 반의 두번째 학생의 점수: " + scores[1][1]);

    //첫번째 반의 평균 점수 구하기
    int total = 0, studentNum = 0;
    double avg = 0;
    for (int i = 0; i < scores[0].length; i++) {
      total += scores[0][i];
    }
    System.out.println("첫번째 반의 평균: " + total);

    //두번째 반의 평균 점수 구하기
    total = 0;
    for (int i = 0; i < scores[1].length; i++) {
      total += scores[1][i];
    }
    System.out.println("두번째 반의 평균: " + total);

    //전체 학생의 평균 점수 구하기
    total = 0;
    for (int i = 0; i < scores.length; i++) {
      for (int j = 0; j < scores[i].length; j++) {
        total += scores[i][j];
        studentNum++;
      }
    }
    System.out.println("전체 학생의 평균: " + (double) total / studentNum);

  }
}
