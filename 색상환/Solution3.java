import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        List<String> list = Arrays.asList("red", "orange", "yellow", "green", "blue", "purple");
        //색을 4변 입력 받음.
        for(int t=0; t<T; t++){
            String colorSet = scanner.nextLine();
            String splitColorSet[] = colorSet.split(" ");
            String color1 = splitColorSet[0];
            String color2 = splitColorSet[1];
            int idx1 = list.indexOf(color1);
            int idx2 = list.indexOf(color2);
            if( idx1 ==-1 || idx2 ==-1) {
                System.out.println("X");
            }else if(idx1==idx2){
                System.out.println("E");
            }else if((idx1+1)%6==idx2 || (idx1+5)%6==idx2){
                System.out.println("A");
            }else if((idx1+3)%6 ==idx2){
                System.out.println("C");
            }else {
                System.out.println("X");
            }

        }
    }
}
