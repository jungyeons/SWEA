import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //테스트 횟수 (첫 줄)
        int T = Integer.parseInt(scan.nextLine());

        for(int i=0; i<T; i++){
            String input = scan.nextLine();
            int K = Integer.parseInt(scan.nextLine());
            String[] operations = scan.nextLine().split(" ");
            char[] arr = input.toCharArray();
            for (int j = 0; j < K; j++) {
                int op = Integer.parseInt(operations[j]);
                int len = arr.length;

                if(op > 0){
                    for(int k=0; k<op%len; k++){
                        char first = arr[0];
                        for(int m=0; m<len-1; m++){
                            arr[m] = arr[m+1];
                        }
                        arr[len-1] = first;
                    }
                }else if(op < 0){
                    for(int k=0; k<(-op)% len; k++){
                        char last = arr[len-1];
                        for(int m=len-1; m>0; m--){
                            arr[m] = arr[m-1];
                        }
                        arr[0] = last;
                    }
                }
            }
            System.out.println(new String(arr));
        }
    }
}
