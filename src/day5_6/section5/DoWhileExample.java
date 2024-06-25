package day5_6.section5;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        n = scanner.nextInt();

        do {
            sum += n;
            n--;
        } while (n >= 10);

        System.out.println(sum);
    }
}