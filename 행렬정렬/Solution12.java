import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 전체 테스트 케이스 수
        int T = Integer.parseInt(scan.nextLine());

        for (int t = 0; t < T; t++) {
            // 행렬 크기
            int N = Integer.parseInt(scan.nextLine());
            int[][] arr = new int[N][N];

            // 행렬 입력
            for (int i = 0; i < N; i++) {
                String[] line = scan.nextLine().split(" ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(line[j]);
                }
            }

            // 전치 연산 횟수 계산
            int count = 0;

            // 오른쪽에서 왼쪽으로 검사
            for (int i = N - 1; i >= 1; i--) {
                if (arr[0][i] != i + 1) {
                    count++;
                    transpose(arr, i + 1);
                }
            }

            // 결과 출력
            System.out.println(count);
        }

        scan.close();
    }

    // 부분 행렬 전치 함수: 0~x-1 범위의 정사각형 부분을 전치
    public static void transpose(int[][] matrix, int x) {
        for (int i = 0; i < x; i++) {
            for (int j = i + 1; j < x; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}

