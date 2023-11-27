package d2prob;

import java.util.Scanner;

public class D2Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] interger = new int[5];
        for (int i = 0; i < interger.length; i++) {
            interger[i] =  scanner.nextInt();
        }
        System.out.println((((interger[0] + interger[1] - interger[2]) * interger[3]) / interger[4]));
    }
}
