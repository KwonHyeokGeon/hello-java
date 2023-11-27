package d2prob;

public class D2Q6 {
    public static void main(String[] args) {
      String str1 = "%s의 둘레는 반지름X %d X %f입니다.";
      String circle = "원";
      int two = 2;
      double PI = 3.14;

      String str2 = str1.formatted(circle, two, PI);
        System.out.println(str2);
        System.out.printf((str1) + "%n", circle, two, PI);
    }
}
