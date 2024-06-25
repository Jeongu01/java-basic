package day5_6.section4;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 1;
		while (choice == 1) {
			int n = scanner.nextInt();
			if(n%2 == 0){
				System.out.println(n + "은 짝수입니다.");
			} else {
				System.out.println(n + "은 홀수입니다.");
			}
			System.out.print("계속 입력을 받고 싶다면 1, 끝내고 싶다면 0을 입력하세요 : ");
			choice = scanner.nextInt();
		}
	}
}