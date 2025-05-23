import java.util.Arrays;
import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =(Integer.parseInt(sc.nextLine()));
        int []arr = new int[2];
        for(int i=0;i<num;i++){
            int num1 =sc.nextInt();
            arr[0] =num1;
            int num2 =sc.nextInt();
            arr[1] =num2;
            int num3 =sc.nextInt();
            arr[2] =num3;
            sc.nextLine();
            int minEat = Integer.MAX_VALUE;
            boolean possible = false;
            for(int a=1 ; a<=arr[0]; a++){
                for(int b=a+1 ; b<=arr[1]; b++){
                    for(int c=b+1 ; c<=arr[2]; c++){
                        int eat = (arr[0]-a)+ (arr[1]-b)+ (arr[2]-c);
                        minEat = Math.min(minEat, eat);
                        possible = true;
                    }
                }
            }
            if(possible){
                System.out.println("#"+(i+1)+" "+minEat);
            }else{
                System.out.println("#"+(i+1)+" -1");
            }
        }

    }
}
