import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수

        for (int t = 1; t <= T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int minEat = Integer.MAX_VALUE;
            boolean possible = false;

            // a < b < c 이면서 a >= 1, b >= 1, c >= 1 을 만족하는 모든 조합 탐색
            for (int a = 1; a <= A; a++) {
                for (int b = a + 1; b <= B; b++) {
                    for (int c = b + 1; c <= C; c++) {
                        int eat = (A - a) + (B - b) + (C - c);
                        minEat = Math.min(minEat, eat);
                        possible = true;
                    }
                }
            }

            if (possible) {
                System.out.println("#" + t + " " + minEat);
            } else {
                System.out.println("#" + t + " -1");
            }
        }

        sc.close();
    }
}
