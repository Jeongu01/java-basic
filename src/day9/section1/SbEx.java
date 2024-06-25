package day9.section1;

public class SbEx {

  public static void main(String[] args) {
    // StringBuffer , StringBuilder 클래스는 문자열 연산(연결, 변경, 수정)에 주로 활용된다.

    // String 클래스 +, concat() : 문자열을 이어 붙여서 사용함

    StringBuffer sb = new StringBuffer();
    StringBuilder stringBuilder = new StringBuilder();
    sb.append("hello");
    sb.append(" StringBuffer");
    sb.append(" Nice meet you");
    sb.append(" !!!");
    stringBuilder.append("hello");
    stringBuilder.append(" StringBuffer");
    stringBuilder.append(" Nice meet you");
    stringBuilder.append(" !!!");
    String result = sb.toString();
    String builderResult = stringBuilder.toString();
    System.out.println(
        result);   // 내부적으로 버퍼(buffer)가 제공되어 문자열 연산을 하여 제공하여 최종 결과를 만들 때 사용 (연산 속도가 빠르다)
    System.out.println(builderResult);

    String str1 = "ABCDEFGHIJKLMN";
    StringBuffer sb1 = new StringBuffer(str1);
    StringBuilder stringBuilder1 = new StringBuilder(str1);
    System.out.println(sb1);
    System.out.println(stringBuilder1);
    // sb1 String 로 casting 하세요
    String str2 = sb1.toString();
    String str3 = sb1.substring(str1.indexOf('D'), str1.indexOf('J') + 1);
    System.out.println(str3);
    String strb2 = stringBuilder1.toString();
    String strb3 = stringBuilder1.substring(str1.indexOf('D'), str1.indexOf('J') + 1);
    sb1.insert(2, "OPQRSTU"); // 삽입
    stringBuilder1.insert(2, "OPQRSTU");
    String str4 = sb1.toString();
    System.out.println(str4);
    String strb4 = stringBuilder1.toString();

    // 현재 sb1의 문자열에서 문자 O부터 I까지 삭제한 결과값 출력 "ABJKLMN"
    sb1.delete(sb1.indexOf("O"), sb1.indexOf("I") + 1);
    System.out.println(sb1);
    stringBuilder1.delete(stringBuilder1.indexOf("O"), stringBuilder1.indexOf("I") + 1);

    // 현재 sb1 문자열에  "ABJKLMN" ==> ""ABJKLMNOPQRSTU" 로 변경 연산 하기
    sb1.append("OPQRSTU");  // 이어 붙이기
    System.out.println(sb1);
    stringBuilder1.append("OPQRSTU");
    System.out.println(stringBuilder1);

    // 현재 sb1의 문자열의 총 길이 출력
    System.out.println(sb1.length());
    System.out.println(stringBuilder1.length());

    // 현재 sb1의 용량(capacity) 출력
    System.out.println(sb1.capacity());
    System.out.println(stringBuilder1.capacity());

    // 현재 sb1의 문자열을 뒤집어 출력하기
    System.out.println(sb1.reverse());
    System.out.println(stringBuilder1.reverse());

    String str7 = sb1.toString();

  }

}
