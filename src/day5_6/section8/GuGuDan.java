package day5_6.section8;

import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        int start, end;
        start = scanner.nextInt();
        end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
