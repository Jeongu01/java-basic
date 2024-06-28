package day10.section2;

// 실행클래스 UserMain 생성하여 본인 객체를 생성하세요
public class UserMain {

  public static void main(String[] args) {
    User me = new User("김정우", "0000000000000");
//    System.out.println("국적 : " + me.nation + ", 이름 : " + me.name + ", 주민번호 : " + me.ssn);
    // me 객체의 이름을 "홍길동" 으로 변경하고 ssn을 "1111111111111" 변경

    String oldmename = me.getName();
    String oldmessn = me.getSsn();

    me.setName("홍길동");
    me.setSsn("1111111111111");

    // 변경된 이름과 ssn을 조회하세요.
    System.out.println("변경 전 : " + oldmename + ", " + oldmessn);
    System.out.println("현재 값 : " + me.getName() + ", " + me.getSsn());
  }
}
