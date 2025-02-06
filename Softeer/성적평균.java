import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static int N; // 학생 수
    public static int K; // 구간 수
    public static int[] scores;
    public static double[] avgs;
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        scores = new int[N];
        avgs = new double[K];

        st = new StringTokenizer(bf.readLine());
        for( int i = 0; i < N; i++ ){ // 점수 저장
            scores[i] = Integer.parseInt(st.nextToken());
        }

        for( int i = 0; i < K; i++ ){ // 범위 입력 받고 평균 계산
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            avgs[i] = calculateAvg(start, end);
        }

        for( int i = 0; i < K; i++ ){ // 범위 입력 받고 평균 계산
            System.out.println(String.format("%.2f", avgs[i]));
        }

        
    }

    public static double calculateAvg(int start, int end){
        int sum = 0;
        int n = end - start + 1;

        for( int i = start ; i < end + 1; i++ ){
            sum += scores[i - 1];
        }

        double answer = (double)sum/n;
        return Double.parseDouble(String.format("%.2f", answer));

    }
    
}
