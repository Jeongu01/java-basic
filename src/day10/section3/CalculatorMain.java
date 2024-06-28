package day10.section3;

public class CalculatorMain {

  public static void main(String[] args) {

    // 1. 계산기 한개를 생성합니다.
    Calculator calculator = new Calculator();
    // 2. 계산기의 전원을 켭니다.
    calculator.powerOn();
    // 3. 두 개의 정수를 전달하여 계산한 결과값을 출력
    int intOp1 = 10, intOp2 = 20, intResult;
    intResult = calculator.plus(intOp1, intOp2);
    System.out.println("두 개의 정수를 전달하여 계산한 결과값 : " + intResult);
    // 4. 두 개의 실수를 전달하여 계산한 결과값을 출력
    double doubleOp1 = 20, doubleOp2 = 4, doubleResult;
    doubleResult = calculator.divide(doubleOp1, doubleOp2);
    System.out.println("두 개의 실수를 전달하여 계산한 결과값 : " + doubleResult);
    // 5. 계산기의 전원을 끕니다.
    calculator.powerOff();

  }

}
