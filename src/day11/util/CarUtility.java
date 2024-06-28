package day11.util;

import day11.dto.CarVo;

public class CarUtility {

  public void carPrint(CarVo car) {
    System.out.println(car.getCarName() + "(" + car.getCarSn() + ") 차량 정보입니다.");
    System.out.println(
        "차종 : " + car.getCarName() +
            "\n가격 : " + car.getCarPrice() +
            "\n차주 : " + car.getCarOwner() +
            "\n연식 : " + car.getCarYear() +
            "\n연료 : " + car.getCarType()
    );
  }

}
