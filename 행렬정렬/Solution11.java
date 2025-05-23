import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //전체 입력 횟수
        int T = Integer.parseInt(scan.nextLine());
        for(int t=1; t<=T; t++){
            //행렬 크기
            int s = Integer.parseInt(scan.nextLine());
            int [][] arr = new int[s][s];
            for(int i=0; i<s; i++){
                String[] line = scan.nextLine().split(" ");
             for(int j=0; j<s; j++){
                 arr[i][j] = Integer.parseInt(line[j]);
             }
            }
            int count = 0 ;
             for(int i=s-1; i>=1; i++){
                 if(arr[0][i] != i+1){
                     count++;
                     tran(arr,i+1);
                 }
             }
            System.out.println(count);
        }
        scan.close();
    }
    public static void tran(int[][] matrix, int x){
        for(int i=0; i<x; i++){
            for(int j=i+1; j<x; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
