package day12.prob;

/*
1. Student 클래스는 다음과 같은 필드를 가집니다.
이름 변수 name : 문자열
과정명 변수 subject : 문자열
교육비 변수 fee : 정수
환급금 변수 returnFee : 실수

2. Student 클래스는 다음과 같은 생성자를 가집니다.
이름(name), 과정명(subject), 교육비(fee) 를 매개변수로 받는 생성자

3. Student 클래스는 다음과 같은 메소드를 가집니다.
3-1. void calcReturnFee() 메소드 :
과정명(subject)이 “javaprogram”이면 환급금은 교육비(fee)의 25%로 계산 과정명(subject)이 “jspprogram”이면
환급금은 교육비(fee)의 20%로 계산 나머지 과정명은 “그런 과정명은 없습니다” 출력하고 메서드 중단
3-2. void print() 메소드 :
다음과 같은 형식으로 Student 정보 출력.
- name, subject, fee, returnFee 를 차례대로 출력.
예) xxx 씨의 과정명은 xxxx 이고 교육비는 xxx 이며 환급금은 xxx 입니다.
- 모든 필드는 외부에서 직접 접근하여 값을 변경하거나 얻어가지 못하도록 private로 접근 제한을 막고,
생성자와 메소드는 제한 없이 모두 호출할 수 있는 접근 제한자(public)를 사용합니다.
- 문제에서 주어진 main 메서드 처럼 args 로 이름, 과정명, 교육비 데이터를 받아서 Student 클래스 객체 생성해서 작성합니다.
* */
public class Student {

  private String name;
  private String subject;
  private int fee;
  private double returnFee = 0;

  public Student(String name, String subject, int fee) {
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  /*

3-1. void calcReturnFee() 메소드 :
과정명(subject)이 “javaprogram”이면 환급금은 교육비(fee)의 25%로 계산 과정명(subject)이 “jspprogram”이면
환급금은 교육비(fee)의 20%로 계산 나머지 과정명은 “그런 과정명은 없습니다” 출력하고 메서드 중단

3-2. void print() 메소드 :
다음과 같은 형식으로 Student 정보 출력.
- name, subject, fee, returnFee 를 차례대로 출력.
예) xxx 씨의 과정명은 xxxx 이고 교육비는 xxx 이며 환급금은 xxx 입니다.

* */
  public void calcReturnFee() {
    if (this.subject.equals("javaprogram")) {
      this.returnFee = fee * 0.25;
    } else if (this.subject.equals("jspprogram")) {
      this.returnFee = fee * 0.2;
    } else {
      System.out.println("그런 과정명은 없습니다");
    }
  }

  public void print() {
    System.out.println(
        name + " 씨의 과정명은 " + subject + " 이고 교육비는 " + fee + " 이며 환급금은 " + returnFee + " 입니다.");
  }

  public static void main(String args[]) {
    Student stu = new Student("차은우", "jspprogram", 500000);
    stu.calcReturnFee();
    stu.print();
  }

}