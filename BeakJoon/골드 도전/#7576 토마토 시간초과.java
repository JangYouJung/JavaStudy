
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    static int[][] box;
    static int M, N;
    static int[] X = { 0, 1, 0, -1 };
    static int[] Y = { 1, 0, -1, 0 };


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer( bf.readLine(), " " );
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];

        for( int n = 0; n < N; n++ ){   // 상자에 토마토 담기
            st = new StringTokenizer( bf.readLine(), " ");
            for( int m = 0; m < M; m++ ){
                int tomato = Integer.parseInt(st.nextToken());
                box[n][m] = tomato;
            }
        }

        int days = 0;

        while(true) {

            /*********** 확인용 출력문 ***********/
            System.out.println("day "+ days);
            for( int n = 0; n < N; n++ ) {
                for (int m = 0; m < M; m++) {
                    System.out.print(box[n][m] + " ");
                }
                System.out.println();
            }
            /********************************/

            boolean change = false; // 변화가 있었는지 확인
            Queue<int[]> ripedTomato = new LinkedList<>();

            for( int n = 0; n < N; n++ ){ // 현재 익은 토마토 위치 파악
                for( int m = 0; m < M; m++ ){
                    if( box[n][m] == 1 ){
                        ripedTomato.offer(new int[]{n,m});
                    }
                }
            }

            while(!ripedTomato.isEmpty()){ // 현재 익은 토마토에 대해서만 사방탐색 진행
                int[] location = ripedTomato.poll();
                if(bfs( location[0], location[1] )){
                    change = true;
                }
            }

            if(!change){ // 하룻동안 변화가 없었는데 여전히 안익은 토마토가 있다면 -1 리턴
                if(Arrays.stream(box).flatMapToInt(Arrays::stream).anyMatch(num -> num == 0)) days = -1;
                break;
            }
            days ++;
        }

        System.out.println(days);

    }

    static boolean bfs( int n, int m ){

        boolean change = false;

        for( int i = 0; i < 4; i++ ){
            int x = n + X[i];
            int y = m + Y[i];

            if( x < 0 || y < 0 || x > (N - 1) || y > (M - 1) ) continue;
            else if( box[x][y] == 0 ) {
                box[x][y] = 1;
                change = true;
            }
        }
        return change;
    }
}

