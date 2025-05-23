import java.util.Scanner;

public class Solution10 {

    static int [] fib = new int[1001];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        //피보나치 수 미리 계산
        fib[1] = fib[2] = 1;
        for(int i =3; i<=1000; i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        for(int t=1; t<=T; t++){
            int N = scan.nextInt();
            int totalSum = 0;
            for(int i=1; i<=N; i++){
                totalSum += fib[i];
            }
            if(totalSum%2!=0){
                System.out.println("impossible");
                continue;
            }
            int target = totalSum/2;
            boolean [][] dp = new boolean[N+1][target+1];
            dp[0][0] = true;
            for(int i=1; i<=N; i++){
                for(int j=0; j<=target; j++){
                    dp[i][j] = dp[i-1][j];
                    if(j>=fib[i]){
                        dp[i][j] |= dp[i-1][j-fib[i]];
                    }
                }
            }
        }
    }
}
