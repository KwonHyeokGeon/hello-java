package d4;

public class Q5 {
/*
int[]를 인자로 받아,
순서가 반대가 되어있는 배열을 반환하는 메서드를 작성하시오.
*/
    public static int[] reverse(int[] numbers){
        int[] result = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            result[i] = numbers[numbers.length - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] result = reverse(numbers);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
