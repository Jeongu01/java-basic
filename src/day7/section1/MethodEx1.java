package day7.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MethodEx1 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  static void getPlayerInfo(int group, int n) {
    String diceGroupName = new String("");
    
    System.out.println("그룹 : " + group + " " + "각 그룹의 인원수 : " + n);
  }


  public static void main(String[] args) throws IOException {
    // 주사위 프로그램을 여러명이 참여하여 차례로 한번씩 주사위를 던질 수 있도록 제공하는 프로그램
    MethodEx1 mex1 = new MethodEx1();
    int group = 0;
    int n = 0;
    for (int i = 0; i < 3; i++) {
      group = mex1.SettingGroup();
      n = mex1.playerSetting();

      mex1.dicePlay(group, n);
    }
    getPlayerInfo(group, n);
  }

  int SettingGroup() throws IOException {
    System.out.print("몇 개의 그룹으로 진행할까요?");
    StringTokenizer st = new StringTokenizer(br.readLine());
    int group = Integer.parseInt(st.nextToken());
    return group;
  }

  int playerSetting() throws IOException {
    System.out.print("참여자의 인원 수를 입력해 주세요.");
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());

    return n;
  }

  public void dicePlay(int group, int n) {
    for (int i = 0; i < group; i++) {
      System.out.printf("%d 의 플레이가 시작됩니다.\n", i);
      for (int j = 0; j < n; j++) {
        int num = (int) (Math.random() * 6) + 1;

        if (num == 1) {
          System.out.println("1번이 나왔습니다.");
        } else if (num == 2) {
          System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
          System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
          System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
          System.out.println("5번이 나왔습니다.");
        } else {
          System.out.println("6번이 나왔습니다.");
        }
      }
    }
  }
}
