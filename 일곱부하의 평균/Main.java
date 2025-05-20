import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int[] heights = new int[6];
            int sum = 0;
            int maxHeight = 0;

            // 6명 키 입력받기
            for (int i = 0; i < 6; i++) {
                heights[i] = sc.nextInt();
                sum += heights[i];
                if (heights[i] > maxHeight) {
                    maxHeight = heights[i];
                }
            }

            // 사라진 키 x 찾기: 조건을 만족하는 가장 작은 값
            for (int x = maxHeight + 1; x <= 10000; x++) {
                int total = sum + x;
                if (total % 7 == 0) {
                    // 평균이 정수이고, 키 조건도 만족
                    System.out.println(x);
                    break;
                }
            }
        }

        sc.close();
    }
}

