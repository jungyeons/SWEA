import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = Integer.parseInt(scan.nextLine());
        int N = 0;
        for(int t = 0; t<T; t++){
            N = Integer.parseInt(scan.nextLine());
        }

        //A팀의 선호도 순서를 저장
        String[] arrA = scan.nextLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(arrA[i])-1;
        }

        String[] arrB = scan.nextLine().split(" ");
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(arrB[i])-1;
        }

        //각 선수의 소속 팀을 저장할  문자 배열
        char[] teamOfPlayer = new char[N];
        //선택 되었는지 여부
        boolean []chosen = new boolean[N];
        // true면 A팀 차례, false면 B팀 차례
            boolean turn = true;
            // true면 A팀 차례, false면 B팀 차례
            int idxA = 0;
            int idxB = 0;
            int total = 0;
            for (int i = 0; i < N; i++) {
                if(turn){
                    //A팀에서 선택된 사람이라면 인덱스를 늘리고
                while(chosen[A[idxA]]){
                    idxA++;
                }
                //선택이 안 되었다면?
                int player = A[idxA];
                teamOfPlayer[player] = 'A';
                chosen[player] = true;
                    idxA++;
                }else{
                    while(chosen[B[idxB]]){
                        idxB++;
                    }
                    int player = B[idxB];
                    teamOfPlayer[player] = 'B';
                    chosen[player] = true;
                    idxB++;
                }
                total++;
                //순서 바꾸는 default 코드
                turn = !turn; // 차례 바꾸기
            }
            //결과를 출력
        for (int i = 0; i < N; i++) {
                System.out.print(teamOfPlayer[i]);
            }
            System.out.println();
        }

    }


