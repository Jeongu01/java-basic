package day10.section1;

// 실행클래스 UserMain 생성하여 본인 객체를 생성하세요
public class UserMain {

  public static void main(String[] args) {
    User me = new User("김정우", "0123456789012");
    System.out.println("국적 : " + me.nation + ", 이름 : " + me.name + ", 주민번호 : " + me.ssn);

  }
}
