import java.util.Scanner;

public class Main {

    static int[][] field;
    static int M, N, k;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //T = 테스트 케이스 개수
        int T = in.nextInt();

        for(int i = 0; i < T; i++){
            M = in.nextInt();   // 배추밭 가로 길이
            N = in.nextInt();   // 배추밭 세로 길이
            k = in.nextInt();   // 배추 개수

            field = new int[M][N]; // 배추밭 2차원 배열 field

            // 필드에 배추 심기
            for(int j = 0; j < k; j++){
                int x = in.nextInt();
                int y = in.nextInt();
                field[x][y] = 1;
            }

            int worm = 0;   // 배추흰지렁이 개수

            // 필드 탐색하기
            for(int j = 0; j < N; j++){
                for(int l = 0; l < M; l++){
                    if(field[l][j]==1) {
                        worm ++;
                        find(l,j);
                    }
                }
            }
            System.out.println(worm);
        }
    }

    public static void find(int x, int y){
        if(field[x][y]==1){
            field[x][y]=0;
            if(x + 1 < M) find(x+1,y);
            if(y + 1 < N ) find(x,y+1);

            // 수정 후: 나머지 두 방향도 모두 훑도록 수정
            if(x - 1 > -1) find(x-1, y);
            if(y - 1 > -1) find(x,y-1);

        }
    }
}
