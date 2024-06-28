package day12.prob;

/*
*
Alcohol 클래스의 제약조건
1. Drink 클래스를 상속받아야 한다.
2. 알코올 도수를 나타내는 멤버변수(alcper)가 있어야 한다.
3. 멤버변수를 초기화하는 생성자 메서드가 있어야 한다.
4. 부모 클래스인 Drink 의 printTitle() 메서드의 기능을 재정의(오버라이딩) 한다.
5. 부모 클래스인 Drink 의 printData() 메서드의 기능을 재정의(오버라이딩) 한다.
*
* */
public class Alcohol extends Drink {

  private double alcper;

  public Alcohol(String name, int price, int count, double alcper) {
    super(name, price, count);
    this.alcper = alcper;
  }

  static void printTitle() {
    System.out.println("상품명(도수[%])\t단가\t수량\t금액");
  }

  @Override
  void printData() {
    System.out.println(
        name + "(" + alcper + ")" + "\t\t\t" + price + "\t" + count + "\t\t\t" + price * count);
  }
}
