import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];

        for( int i = 0; i < N; i++ ){
            numbers[i] = Integer.parseInt(bf.readLine());
        }

        for( int i = 0; i < M; i++ ){
            st = new StringTokenizer(bf.readLine(), " ");
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;

            System.out.println(getMin(from,to));
        }

    }

    public static int getMin( int from, int to ){
        int min = 1000000001;

        for( int i = from; i <= to; i++ ){
            if( min > numbers[i] ) min = numbers[i];
        }

        return min;
    }
}
