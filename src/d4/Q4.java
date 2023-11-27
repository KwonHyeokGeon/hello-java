package d4;

public class Q4 {
    /*
  int[], long[], double[]
  상기의 자료형에 대해서 동작하는 메서드를 같은 이름으로 만들어
  아래 main 메서드가 오류가 없도록 메서드를 추가하세요.
   */

    public static int avg(int[] intNums) {
        int sum = 0;
        for (int number : intNums) {
            sum += number;
        }
        return sum / intNums.length;
    }

    public static long avg(long[] longNums) {
        long sum = 0;
        for (long number : longNums) {
            sum += number;
        }
        return sum / longNums.length;
    }
    public static double avg(double[] doubleNums) {
        double sum = 0;
        for(double number : doubleNums) {
            sum += number;
        }
        return sum / doubleNums.length;
    }

    // Varargs - 가변인자
//    배열을 위해서 사용X, 인자를 여러 개 전달할 때
//    가변인자를 가장 뒤에 배치
    public static int varargAvg(int... ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum / ints.length;
    }

    public static void main(String[] args) {
        int[] intNums = {1, 2, 3};
        long[] longNums = {2, 4, 6};
        double[] doubleNums = {1, 3, 5};
        System.out.println(avg(intNums));
        System.out.println(avg(longNums));
        System.out.println(avg(doubleNums));

        System.out.println(varargAvg(10, 12, 23, 24));
    }
}
