package day5_6.section1;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 20) + 81;
        String grade;

        if (score >= 70) {
            if (score >= 95) {
                grade = "A+";
            } else if (score >= 90) {
                grade = "A";
            } else if (score >= 85) {
                grade = "B+";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 75) {
                grade = "C+";
            } else {
                grade = "C";
            }
            System.out.println("당신의 학점은 " + grade + " 입니다.");
        } else {
            System.out.println("재수강 하세요!");
        }
    }
}