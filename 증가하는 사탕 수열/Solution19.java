import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수

        for (int t = 1; t <= T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int minEat = Integer.MAX_VALUE;
            boolean found = false;

            // c는 최소 b+1, 최대 C까지 가능
            for (int c = 3; c <= C; c++) {
                int maxB = Math.min(B, c - 1);
                for (int b = 2; b <= maxB; b++) {
                    int maxA = Math.min(A, b - 1);
                    if (maxA >= 1) {
                        int eaten = (A - maxA) + (B - b) + (C - c);
                        minEat = Math.min(minEat, eaten);
                        found = true;
                    }
                }
            }

            if (found) {
                System.out.println("#" + t + " " + minEat);
            } else {
                System.out.println("#" + t + " -1");
            }
        }

        sc.close();
    }
}

