import java.util.Arrays;
import java.util.Scanner;

public class Solution16 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt(); // 테스트 케이스 수

            for (int t = 1; t <= T; t++) {
                int N = sc.nextInt(); // 주머니 수
                int K = sc.nextInt(); // 선택할 수

                int[] a = new int[N];
                for (int i = 0; i < N; i++) {
                    a[i] = sc.nextInt();
                }

                Arrays.sort(a); // 오름차순 정렬

                int minDiff = Integer.MAX_VALUE;
                for (int i = 0; i <= N - K; i++) {
                    int diff = a[i + K - 1] - a[i]; // 연속된 K개 중 최댓값 - 최솟값
                    minDiff = Math.min(minDiff, diff);
                }

                System.out.println("#" + t + " " + minDiff);
            }

            sc.close();
        }
    }


