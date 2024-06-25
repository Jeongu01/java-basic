package day5_6.section8;

public class StarEx {
    public static void main(String[] args) {
        /*
         *********
          *******
           *****
            ***
             *
         */
        for (int i = 0; i < 9; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 2 * i; j < 9; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
