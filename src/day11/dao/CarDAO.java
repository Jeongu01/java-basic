package day11.dao;

import day11.dto.CarVo;
import java.util.ArrayList;
import java.util.List;

public class CarDAO {

  ArrayList<String> carInfo = new ArrayList<>();

  public void carInsert(CarVo car) {
    // DB연결 , insert SQL
    carInfo.add(String.valueOf(car.getCarSn()));
    carInfo.add(car.getCarName());
    carInfo.add(String.valueOf(car.getCarPrice()));
    carInfo.add(car.getCarOwner());
    carInfo.add(String.valueOf(car.getCarYear()));
    carInfo.add(car.getCarType());

    System.out.println("car(" + car.getCarSn() + ") 정보가 DB에 저장되었습니다.");

  }

  public List<String> carSelect(CarVo car) {
    // DB연결 , select SQL
    System.out.println("car(" + car.getCarSn() + ") 정보가 조회되었습니다.");
    return carInfo;
  }

}
