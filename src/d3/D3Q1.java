package d3;

import java.util.Scanner;

public class D3Q1 {
    public static void main(String[] args) {
//        H1
////        한 정수를 입력받아,
////                해당 정수가 음수인지 양수인지 아니면 0인지 출력하는 코드를 작성하여라.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 0){
            System.out.println("음수");
        } else if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println("양수");
        }
    }
}
