import java.util.Scanner;

public class Solution8 {

    //정수 추가
    int [] fib = new int [101];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i =3; i<=100; i++){
            fib[i] = fib[i-1]+fib[]
        }
        int N =0;
        for(int t=1; t<=T; t++){
             N = Integer.parseInt(scan.nextLine());
        }
        if(N==1){
            System.out.println("Impossible");
        }else{
            //recursion or Iteration
            char arr[] = new char[N];
            for(int i=1; i<=N; i++){
                if(N==2){
                    System.out.println("BA");
                }else {
                    arr[i] = (char) ('B'+ arr[i-1]);
                }
            }
        }
    }
}
