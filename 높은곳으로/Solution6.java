import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //횟수
        int T = scan.nextInt();

        for(int t=0; t<T; t++){
            //선택의 횟수 N
         int N = scan.nextInt();
         //폭탄의 층 수 P
         int P = scan.nextInt();
         // N번째 선택에서 위로 i층을 올릴 지 정함
            // 층 수를 올린다.
            int maxSum = N*(N+1)/2;
            // 최대 합이 p면 안됨.
            boolean possible = true;
            System.out.println(maxSum);
        }
    }
}
