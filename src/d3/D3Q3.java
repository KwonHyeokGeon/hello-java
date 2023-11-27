package d3;

import java.util.Scanner;

public class D3Q3 {
    public static void main(String[] args) {
//        H3
//        1인치는 2.54 센티미터이다.
//                사용자에게 정수를 두개 입력받는다.
//                첫번째 정수가 0이라면 두번째 정수는 센티미터이고,
//        첫번째 정수가 1이라면 두번째 정수는 인치이다.
//        센티미터는 해당 길이의 인치로, 인치는 해당 길이의 센티미터로 소수점 2째 자리까지 출력하여라.
        Scanner scanner = new Scanner(System.in);
        int inch = scanner.nextInt();
        int centi = scanner.nextInt();

        if (inch == 0) {
            System.out.printf("%.2f", centi / 2.54);
        } else if (inch == 1) {
            System.out.printf("%.2f", centi * 2.54);
        }
    }
}

