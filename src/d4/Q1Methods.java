package d4;

import java.util.Scanner;

public class Q1Methods {
    public static void main(String[] args) {
//        두 정수(int)를 인자로 받아,
//        두 정수 값의 차이의 절대값을 반환하는 메서드 "diff"를 작성하시오.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(diff(a, b));
    }

    public static int diff(int a, int b){
        return a - b;
    }
}
