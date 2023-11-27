package d5;

public class WrapperClass {
    public static void main(String[] args) {
        //1. 참조 타입이지만, String처럼 값을 할당 가능
        String string = "";
        int primInt = 10;
        Integer refInt = 10;

        String source = "가나다라마바사";
        char[] arr = source.toCharArray();

        System.out.println(arr[5]);

    }
}
