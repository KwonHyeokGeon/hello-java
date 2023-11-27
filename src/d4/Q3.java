package d4;

public class Q3 {
    /*
    피보나치수열 : 음이 아닌 정수 n을 인자로 받아
    F(n) = F(n-1) + F(n-2)

    재귀함수  :F(n) = n * F(n-1)
    */
    public static int fib(int n){
        if(n==0){
            return 0;
        } else if(n == 1 || n == 2) {
            return 1;
        }else{
           return fib(n - 1) + fib( n - 2);
        }
    }
}
