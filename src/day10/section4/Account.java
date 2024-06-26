package day10.section4;

public class Account {

  private String accNo;
  private int balance = 0;

  Account() {
  }

  public void save(int money) {
    System.out.println(accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
    this.balance += money;
  }

  public void deposit(int money) {
    if (this.balance < money) {
      System.out.println(
          "잔고가 부족하여 " + money + "만원을 출금 할 수 없습니다. 현재 남은 잔고는 " + this.balance + "만원입니다.");
    } else {
      System.out.println(accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
      this.balance -= money;
    }
  }

  public int getBalance() {
    return balance;
  }

  public void setAccNo(String accNo) {
    System.out.println(accNo + " 계좌가 개설되었습니다.");
    this.accNo = accNo;
  }

  public String getAccNo() {
    return accNo;
  }
}
