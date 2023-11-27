package d3;

import java.util.Scanner;

//    H2
//    축구리그에서는 승점을, 승리시 3점 무승부시 1점, 패배시 0점을 획득한다.
//    남은 경기와 현재 승점과 목표 승점이 주어졌을 때,
//    남은 경기에서 목표 승점을 넘을 수 있으면 필요한 최소 승수를
//    없으면 최고 승점을 출력하여라.
public class D3Q2 {
    public static void main(String[] args) {
        int win = 3;

        Scanner scanner = new Scanner(System.in);

        int remain = scanner.nextInt();  // 남은경기 2
        int cur = scanner.nextInt(); // 현재승점 50
        int target = scanner.nextInt(); //목표승점 60

        if(remain * win + cur > target){
            int minWin = (target - cur) / win;
            System.out.println(minWin);
        }else {
            System.out.println(cur + remain * win);
        }
    }
}
//    public static int getWindCountOrWinPoint(int remainPlay, int currentPoint, int goalPoint) {
//        int winPoint = 3;
//
//        int remainPoint = goalPoint - currentPoint;//목표까지 남은 승점
//
//        int maximumWinPoint = remainPoint * winPoint;//남은 경기를 모두 이겼을 경우 얻을 수 있는 승점
//        if (maximumWinPoint <= remainPoint) {//최대로 승점을 얻어도 목표점수를 넘기 못할경우
//            return maximumWinPoint;
//        } else {//최대 승점이 목표점수를 넘을 경우
//            return remainPoint / (remainPlay * winPoint) + 1;
//        }
//    }