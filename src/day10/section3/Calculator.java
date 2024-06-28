package day10.section3;

public class Calculator {
  // 리턴값이 없는 메소드 선언 : public 메소드 이름 : powerOn() 실행 : "전원을 켭니다."
  // 리턴값이 없는 메소드 선언 : public 메소드 이름 : powerOff() 실행 : "전원을 끕니다."

  // 호출 시 두 정수를 전달받고 두 값을 더하여, 결과값을 int로 결과값을 반환 메소드 선언 : public
  // 메소드 이름 : plus()

  // 호출 시 두 실수를 전달받고 두 값을 저장해서 두 값을 나누어, 결과값을 double로 결과값을 반환 메소드 선언 : public
  // 메소드 이름 : divide()

  public void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  public void powerOff() {
    System.out.println("전원을 끕니다.");
  }

  public int plus(int operand1, int operand2) {
    return operand1 + operand2;
  }

  public double divide(double operand1, double operand2) {
    return operand1 / operand2;
  }
}
