public class D2Operators {
    public static void main(String[] args) {
        int plus = 10 + 20;
        int minus = 20 - 10;
        int multiply = 20 * 10;
        int divide = 20 / 10;
        int modulo = 15 % 10;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

        System.out.println(21 / 10.0);
//        하나의 피연산자라도 double이면 결과도 double
//        피연산자 둘 다 정수 변수면? 형변환
//        명시적 형변환 => (type)

        int intResult = (int)2.5;
        System.out.println(intResult);

        int left = 21;
        int right = 10;
        double castedResult = left / right;
        System.out.println("형변환" + castedResult);

    }
}
