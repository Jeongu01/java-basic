package day12.prob;

/*

Drink 클래스의 제약조건
1. 상품명(name), 단가(price), 수량(count) 정보를 저장하는 멤버변수가 있어야 한다.
2. 멤버변수를 초기화하는 생성자 메서드가 있어야 한다.
3. 금액(단가*수량)을 계산하는 getTotalPrice() 메서드가 있어야 한다.
4. 타이틀을 출력하는 printTitle() 메서드가 있어야 한다.
5. 상품의 정보를 출력하는 printData() 메서드가 있어야 한다.

*/
public class Drink {

  String name;
  int price;
  int count;

  public Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  int getTotalPrice() {
    return price * count;
  }

  static void printTitle() {
    System.out.println("상품명\t단가\t수량\t금액");
  }

  void printData() {
    System.out.println(name + "\t\t" + price + "\t" + count + "\t\t\t" + price * count);
  }
}
