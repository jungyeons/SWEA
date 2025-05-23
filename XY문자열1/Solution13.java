import java.util.Scanner;

public class Solution13 {
    public static boolean canTransform(String s, String e) {
        //역연산을 하기
        while(e.length()>s.length()){
            //x이면 x자르기
            if(e.charAt(e.length()-1)=='X'){
                e = e.substring(0,e.length()-1);
                //y이면 y자르기
            }else if (e.charAt(e.length()-1)=='Y'){
                e = e.substring(0,e.length()-1);
                e = new StringBuilder(e).reverse().toString();
            }else {
                 return false;
            }
        }
        return e.equals(s);
    }

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int T = Integer.parseInt(scan.nextLine());
     for(int t=1; t<=T; t++){
         String s = scan.nextLine();
         String e = scan.nextLine();
         System.out.println(canTransform(s,e) ? "YES" : "NO");
     }

    }
}
