package day5_6.section2;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;

        switch (time) {
            case 8:
                System.out.println(time + "출근합니다.");
                break;
            case 9:
                System.out.println(time + "회의를 합니다.");
                break;
            case 10:
                System.out.println(time + "업무를 합니다.");
                break;
            case 11:
                System.out.println(time + "출장을 나갑니다.");
                break;
        }
    }
}
