import java.util.*;

public class Solution9 {
    static int[] fib = new int[101];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        // 피보나치 수 미리 계산
        fib[1] = fib[2] = 1;
        for (int i = 3; i <= 100; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();
            int totalSum = 0;
            for (int i = 1; i <= N; i++) {
                totalSum += fib[i];
            }

            if (totalSum % 2 != 0) {
                System.out.println("impossible");
                continue;
            }

            int target = totalSum / 2;
            boolean[][] dp = new boolean[N + 1][target + 1];
            dp[0][0] = true;

            for (int i = 1; i <= N; i++) {
                for (int j = 0; j <= target; j++) {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= fib[i]) {
                        dp[i][j] |= dp[i - 1][j - fib[i]];
                    }
                }
            }

            if (!dp[N][target]) {
                System.out.println("impossible");
                continue;
            }

            // 역추적
            StringBuilder result = new StringBuilder("B".repeat(N));
            int rem = target;
            for (int i = N; i >= 1; i--) {
                if (rem >= fib[i] && dp[i - 1][rem - fib[i]]) {
                    result.setCharAt(i - 1, 'A');
                    rem -= fib[i];
                }
            }

            System.out.println(result.toString());
        }
    }
}
