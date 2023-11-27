package d2prob;

import java.util.Scanner;

public class D2Q1 {
    public static void main(String[] args) {
//        세 과목의 시험점수가 입력될 때,
//                평균 점수를 구하여라.

        Scanner scanner = new Scanner(System.in);

        int score1 = scanner.nextInt();
        int score2 = scanner.nextInt();
        int score3 = scanner.nextInt();

        double avg = (double) (score1 + score2 + score3) / 3;
        System.out.println(avg);
    }
}
