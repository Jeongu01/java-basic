package day12.morningTest;

public class Account {

  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1_000_000;
  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
      System.out.println("0 ~ 1,000,000 범위를 초과하였습니다.");
    } else {
      this.balance = balance;
    }
  }
}
