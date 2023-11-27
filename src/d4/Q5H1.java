package d4;

public class Q5H1 {
    /*
     미세먼지 수치를 입력받고,
     0 ~ 30 이면 "좋음"
     31 ~ 80 이면 "보통"
     80 ~ 150 이면 "나쁨"
     151 ~ 이면 "매우 나쁨"
     이라는 문자열을 반환하는 메서드를 작성하시오.
    */
    public static String dust(int n){
        if (n <= 30){
            return "좋음";
        } else if (n <= 80) {
            return "보통";
        } else if (n <= 150) {
            return "나쁨";
        } else {
            return "매우 나쁨";
        }
    }

    public static void main(String[] args) {
        System.out.println(dust(50));
    }
}
