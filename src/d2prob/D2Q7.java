package d2prob;

public class D2Q7 {
    public static void main(String[] args) {
        // 미세먼지 수치
        int dust = 37;
// 80 이하면 "좋음", 아니면 "나쁨"
        String message = dust <= 80 ? "좋음" : "나쁨";
        System.out.println("미세먼지 수치: %d, (%s)");
    }
}
