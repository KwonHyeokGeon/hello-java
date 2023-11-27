package d4;

import java.util.Scanner;

public class Q5H3 {
    /*사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와
두개의 정수를 입력받아, 각 기호에 대응하는 연산의 결과를
반환하는 메서드를 작성하시오.
단, 정수 범위에서만 결과를 반환합니다.*/
    public static int calculator(char a, int b, int c) {
        if (a == '+') {
            return b + c;
        } else if (a == '-') {
            return b - c;
        } else if (a == '*') {
            return b * c;
        } else if (a == '/') {
            return b / c;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(calculator('*', 1, 5));
    }
}
