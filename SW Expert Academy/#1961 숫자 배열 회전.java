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

            // input_box = 입력 받은 오리지널 박스
            ArrayList<ArrayList<Integer>> input_box = new ArrayList<>();

            // first_box = 90도 돌린 박스
            ArrayList<ArrayList<Integer>> first_box = new ArrayList<>();

            // second_box = 180도 돌린 박스
            ArrayList<ArrayList<Integer>> second_box = new ArrayList<>();

            // third_box = 270도 돌린 박스
            ArrayList<ArrayList<Integer>> third_box = new ArrayList<>();


            // [1] 입력 받아서 input_box 채우기
            for(int i = 0; i < N; i++){
                ArrayList<Integer> row = new ArrayList<>();

                for(int j = 0; j < N; j++){
                    int n = sc.nextInt();
                    row.add(n);
                }
                input_box.add(row);
            }


            // [2] input_box를 90도 회전 시킨 first_box 채우기
            for(int i = 0; i < N; i++){
                ArrayList<Integer> row = new ArrayList<>();

                for(int j = N-1 ; j > -1; j-- ){
                    row.add(input_box.get(j).get(i));
                }

                first_box.add(row);
            }

            
            // [3] fisrt_box를 90도 회전 시킨 second_box 채우기
            for(int i = 0; i < N; i++){
                ArrayList<Integer> row = new ArrayList<>();

                for(int j = N-1 ; j > -1; j-- ){
                    row.add(first_box.get(j).get(i));
                }

                second_box.add(row);
            }

            
            // [4] second_box를 90도 회전 시킨 third_box 채우기
            for(int i = 0; i < N; i++){
                ArrayList<Integer> row = new ArrayList<>();

                for(int j = N-1 ; j > -1; j-- ){
                    row.add(second_box.get(j).get(i));
                }

                third_box.add(row);
            }

            
            //[5] 출력
            System.out.println("#" + test_case);
            for(int j = 0; j < N ; j++){
                
                for(int n : first_box.get(j)){
                    System.out.print(n);
                }
                System.out.print(" ");

                for(int n : second_box.get(j)){
                    System.out.print(n);
                }
                System.out.print(" ");

                for(int n : third_box.get(j)){
                    System.out.print(n);
                }
                System.out.println();
            }
        }
    }
}