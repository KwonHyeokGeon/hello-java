public class D4Methods {
    public static void main(String[] args) {
        System.out.println("얘도 메서드");
        System.out.println(findOneReturn(new int[]{2, 3, 1, 4}));
    }

    public static  int addAndTwice(int a, int b){
        int c = (a + b)* 2;
        return c;
    }

    public static  int addTwoInt(int a, int b){
        return a + b;
    }

    public static int divide(int a, int b, int c){
        int d = (a + b + c) / 3;
            return d;
    }

    public static int findOneReturn(int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            // 찾았다!
            if (numbers[i] == 1) {
                index = i;
                return index;
            }
        }
        System.out.println("for종료");
        return index;
    }
}
