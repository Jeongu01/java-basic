package day11.dto;

public class CarVo {

  private int carSn;
  private String carName;
  private int carPrice;
  private String carOwner;
  private int carYear;
  private String carType;

  public CarVo() {
  }

  public void setCarYear(int carYear) {
    this.carYear = carYear;
  }

  public int getCarYear() {
    return carYear;
  }

  public int getCarSn() {
    return carSn;
  }

  public void setCarSn(int carSn) {
    this.carSn = carSn;
  }

  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  public int getCarPrice() {
    return carPrice;
  }

  public void setCarPrice(int carPrice) {
    this.carPrice = carPrice;
  }

  public String getCarOwner() {
    return carOwner;
  }

  public void setCarOwner(String carOwner) {
    this.carOwner = carOwner;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }
}
