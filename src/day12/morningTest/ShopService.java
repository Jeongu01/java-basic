package day12.morningTest;

public class ShopService {

  private static ShopService singleton = new ShopService();

  private ShopService() {
  }

  static ShopService getInstance() {
    return singleton;
  }
}
