package day5_6.section3;

import java.util.Scanner;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += scanner.nextInt();
		}
		System.out.println(sum);
	}
 }