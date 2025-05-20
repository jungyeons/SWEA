import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        for(int t = 0; t<T; t++){
            String input = scan.nextLine();
            int maxDistL = simulate(input, 'L');
            int maxDistR = simulate(input, 'R');
            System.out.println(Math.max(maxDistL, maxDistR));
        }

    }

    private static int simulate(String input, char l) {
    int pos =0;
    int maxDist = 0;
    char arr[] = input.toCharArray();
     for(int i=0; i<arr.length; i++){
         if(arr[i]=='?'){
             arr[i] = l;
         }
         if(arr[i] =='L'){
             pos--;
         }else if(arr[i]=='R'){
             pos++;
         }
         maxDist = Math.max(maxDist, Math.abs(pos));
    }
     return maxDist;
    }
}
