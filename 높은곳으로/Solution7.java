import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();
            int P = scan.nextInt();

            int maxSum = N * (N + 1) / 2;
            boolean[] possible = new boolean[maxSum + 1];
            possible[0] = true;

            // Subset Sum 방식
            for (int i = 1; i <= N; i++) {
                for (int j = maxSum; j >= i; j--) {
                    if (possible[j - i]) {
                        possible[j] = true;
                    }
                }
            }

            int result = 0;
            for (int i = maxSum; i >= 0; i--) {
                if (i != P && possible[i]) {
                    result = i;
                    break;
                }
            }

            System.out.println(result);
        }

        scan.close();
    }
}
