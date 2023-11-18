import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        // 체스판 가로 세로
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] board = new int[n][m];

        // Queen 좌표 입력
        int q= in.nextInt();
        ArrayList<ArrayList<Integer>> queen = new ArrayList<>();

        for(int i = 0; i < q; i++){
            ArrayList<Integer> location = new ArrayList<>();
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;

            location.add(x);
            location.add(y);
            queen.add(location);

            board[x][y]=2;
        }


        // Knight 좌표 입력 / 보드에 나이트 위험 구역 표시
        int k= in.nextInt();

        for(int i = 0; i < k; i++){
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;

            board[x][y]=2;

            if(x-1>-1 && y-2>-1) board[x-1][y-2]=1;
            if(x-2>-1 && y-1>-1) board[x-2][y-1]=1;
            if(x-2>-1 && y+1<m) board[x-2][y+1]=1;
            if(x-1>-1 && y+2<m) board[x-1][y+2]=1;
            if(x+1<n && y+2<m) board[x+1][y+2]=1;
            if(x+2<n && y+1<m) board[x+2][y+1]=1;
            if(x+2<n && y-1>-1) board[x+2][y-1]=1;
            if(x+1<n && y-2>-1) board[x+1][y-2]=1;
        }

        // Pawn 좌표 입력 / pawn 위치 표시
        int p= in.nextInt();
        for(int i = 0; i < p; i++){
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;

            board[x][y] = 2;
        }


        for(int i = 0; i < q; i++){
            int x = queen.get(i).get(0);
            int y = queen.get(i).get(1);

            //[1] 12시 방향 탐색
            int tmp = x;
            while(true){
                tmp--;
                if(tmp == -1 || board[tmp][y] == 2) break;
                else board[tmp][y] = 1;
            }

            //[2] 6시 방향 탐색
            tmp = x;
            while(true){
                tmp++;
                if(tmp == n || board[tmp][y] == 2) break;
                else board[tmp][y] = 1;
            }

            //[3] 3시 방향 탐색
            tmp = y;
            while(true){
                tmp++;
                if(tmp == m || board[x][tmp] == 2) break;
                else board[x][tmp] = 1;
            }

            //[4] 9시 방향 탐색
            tmp = y;
            while(true){
                tmp--;
                if(tmp == -1 || board[x][tmp] == 2) break;
                else board[x][tmp] = 1;
            }

            //[5] 1~2시 방향 대각선 탐색
            int tmpx = x;
            int tmpy = y;
            while(true){
                tmpx--;
                tmpy++;
                if(tmpx == -1 || tmpy ==m || board[tmpx][tmpy] == 2) break;
                else board[tmpx][tmpy] = 1;
            }

            //[6] 4~5시 방향 대각선 탐색
            tmpx = x;
            tmpy = y;
            while(true){
                tmpx++;
                tmpy++;
                if(tmpx == n || tmpy ==m || board[tmpx][tmpy] == 2) break;
                else board[tmpx][tmpy] = 1;
            }

            //[7] 7~8시 방향 대각선 탐색
            tmpx = x;
            tmpy = y;
            while(true){
                tmpx++;
                tmpy--;
                if(tmpx == n || tmpy == -1 || board[tmpx][tmpy] == 2) break;
                else board[tmpx][tmpy] = 1;
            }

            //[8] 10~11시 방향 대각선 탐색
            tmpx = x;
            tmpy = y;
            while(true){
                tmpx--;
                tmpy--;
                if(tmpx == -1 || tmpy == -1 || board[tmpx][tmpy] == 2) break;
                else board[tmpx][tmpy] = 1;
            }

        }


        int safe_zone = 0;
        //보드판 출력
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(board[i][j]==0) safe_zone++;
                ////
                System.out.print(board[i][j]+" ");
            }
            ////
            System.out.println();
        }
        System.out.println("safe: "+safe_zone);
    }
}
