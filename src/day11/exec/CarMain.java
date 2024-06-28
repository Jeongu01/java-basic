package day11.exec;

import day11.dao.CarDAO;
import day11.dto.CarVo;
import day11.util.CarUtility;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class CarMain {

  static int serialNum = 1000;

  public static void main(String[] args) {
    // 1. 자동차의 정보를 입력받아 자동차 volvo 객체를 생성해 주세요.
    Scanner scanner = new Scanner(System.in);
    CarVo volvo = new CarVo();
    volvo.setCarSn(++serialNum);
    System.out.print("차종 : ");
    volvo.setCarName(scanner.nextLine());
    System.out.print("가격 : ");
    volvo.setCarPrice(scanner.nextInt());
    System.out.print("차주 : ");
    scanner.nextLine();
    volvo.setCarOwner(scanner.nextLine());
    System.out.print("연료 : ");
    volvo.setCarType(scanner.nextLine());
    System.out.print("년도 : ");
    volvo.setCarYear(scanner.nextInt());

    // 2. 생성된 volvo 인스턴스를 데이터베이스에 입력해 주세요.
    CarDAO carDAO = new CarDAO();
    carDAO.carInsert(volvo);

    // 3. 데이터베이스에 저장된 volvo를 조회해 주세요.
    List<String> carInfo = carDAO.carSelect(volvo);
    CarUtility carUtility = new CarUtility();
    carUtility.carPrint(volvo);
  }

}
