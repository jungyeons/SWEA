import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num =0;
    int num2 =0;
    int T = scanner.nextInt();
    for(int t=0; t<T; t++) {
        num = scanner.nextInt();
        num2 = scanner.nextInt();
        scanner.nextLine();
    }
    if(num%num2>num2){
        System.out.println("yes");
    }else {
        System.out.println("no");
    }
    }

}
