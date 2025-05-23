import java.util.*;

public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int tc = 1; tc <= T; tc++) {
            String[] parts = sc.nextLine().split(" ");
            String s = parts[0];
            int K = Integer.parseInt(parts[1]);

            double[] curr = new double[3];

            // 시작 위치 설정
            for (int i = 0; i < 3; i++) {
                if (s.charAt(i) == 'o') {
                    curr[i] = 1.0;
                    break;
                }
            }

            // K번 상태 전이
            for (int k = 0; k < K; k++) {
                double[] next = new double[3];

                // 앞면: 0 <-> 1
                next[0] += 0.5 * curr[1];
                next[1] += 0.5 * curr[0];

                // 뒷면: 1 <-> 2
                next[1] += 0.5 * curr[2];
                next[2] += 0.5 * curr[1];

                curr = next;
            }

            // 최대 확률의 위치 찾기 (왼쪽 우선)
            int maxIndex = 0;
            for (int i = 1; i < 3; i++) {
                if (curr[i] > curr[maxIndex]) {
                    maxIndex = i;
                }
            }

            System.out.println("#" + tc + " " + maxIndex);
        }
    }
}
