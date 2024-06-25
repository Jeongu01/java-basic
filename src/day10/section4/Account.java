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
    System.out.println(accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
    this.balance -= money;
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
