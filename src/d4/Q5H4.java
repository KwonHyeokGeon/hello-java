package d4;

public class Q5H4 {
    /*int[]을 인자로 받아,

배열의 값들 중 최댓값의 위치를 반환하는 "maxWhere"
배열의 값들 중 최솟값의 위치를 반환하는 "minWhere"
배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 "maxDiff"

메서드를 각각 작성하시오.*/
    public static int maxWhere(int[] arr){
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;

            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] array = {3,5,7,6,8,4};

        System.out.println(maxWhere(array));
    }
}
