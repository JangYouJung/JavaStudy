import java.util.ArrayList;
import java.util.Scanner;
class Solution {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int max = 0; //최대 파리 개수

            // Field = N x N 영역
            ArrayList<ArrayList<Integer>> Field = new ArrayList<>();

            // [1] 입력값을 2차원 배열 Field에 담기
            for(int i = 0; i < N; i++){
                ArrayList<Integer> row = new ArrayList<>();
                for(int j = 0; j < N; j++){
                    int n = sc.nextInt();
                    row.add(n);
                }
                Field.add(row);
            }

            //[2] 파리채를 하나하나 대보며 최댓값 구하기
            for(int i = 0; i < N - M + 1 ; i++){
                for(int j = 0; j < N - M + 1 ; j++){

                    int sum = 0; //파리 개수
                    for(int k = i; k < i+M; k++){
                        for(int l = j; l < j+M; l++){
                            sum+=Field.get(k).get(l);
                        }
                    }
                    if(sum>max) max = sum;
                }
            }
            System.out.println("#"+test_case+" "+max);
        }
    }
}