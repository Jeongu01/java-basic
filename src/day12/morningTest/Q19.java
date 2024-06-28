package day12.morningTest;

public class Q19 {

  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(10000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(-100);
    System.out.println("현재 잔고: " + account.getBalance());
    account.setBalance(2_000_000);
    System.out.println("현재 잔고: " + account.getBalance());
    account.setBalance(300000);
    System.out.println("현재 잔고: " + account.getBalance());
  }

}
