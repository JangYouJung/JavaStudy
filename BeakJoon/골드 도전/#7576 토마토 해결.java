import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int[][] box;
    static int[][] visited; // 중복 탐색 방지용
    static int M, N;
    static int[] X = { 0, 1, 0, -1 };
    static int[] Y = { 1, 0, -1, 0 };
    static Deque<int[]> tomatoes;


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer( bf.readLine(), " " );
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        visited = new int[N][M];
        tomatoes = new LinkedList<>();

        for( int n = 0; n < N; n++ ){   // 상자에 토마토 담기
            st = new StringTokenizer( bf.readLine(), " ");
            for( int m = 0; m < M; m++ ){
                int tomato = Integer.parseInt(st.nextToken());
                box[n][m] = tomato;

                if(tomato==1) tomatoes.offerFirst(new int[]{n,m,1});
            }
        }


        while(!tomatoes.isEmpty()){
            int[] index = tomatoes.pollLast();
            bfs(index[0],index[1],index[2]);
        }

        /*********** 확인용 출력문 ***********/
        for( int n = 0; n < N; n++ ) {
            for (int m = 0; m < M; m++) {
                System.out.print(box[n][m] + " ");
            }
            System.out.println();
        }
        /********************************/

        int max = 0;
        for( int n = 0; n < N; n++ ){
            for( int m = 0; m < M; m++ ){
                if( box[n][m] == 0 ){       // 안익은 토마토 있으면 -1
                    System.out.println(-1);
                    System.exit(0);
                }
                else if( max < box[n][m] ){ // 최소 소요일은 max - 1
                    max = box[n][m];
                }
            }
        }
        System.out.println( max - 1 );

    }

    static void bfs( int n, int m, int day ){ // 사방탐색
        for( int i = 0; i < 4; i++ ){
            int x = n + X[i];
            int y = m + Y[i];

            if( x < 0 || y < 0 || x > ( N - 1 ) || y > ( M - 1 ) ) continue;
            else if( box[x][y] == 0 ) {
                box[x][y] += ( day + 1 );
                tomatoes.offerFirst(new int[]{x,y, box[x][y]});
            }
        }
    }
}

