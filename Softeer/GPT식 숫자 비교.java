import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] numbers;

    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(input.readLine());
        numbers = new int[N][2];
        
        for(int i = 0; i < N; i++ ){
            String n = input.readLine();
            if(n.contains(".")){
                String[] ss = n.split("\\.");
                numbers[i][0] = Integer.parseInt(ss[0]);
                numbers[i][1] = Integer.parseInt(ss[1]);
            }
            else{
                numbers[i][0] = Integer.parseInt(n);
                numbers[i][1] = -1;
            }
        }

        gptBubbleSort();

        for( int i = 0; i < N; i++ ){
            if(numbers[i][1] == -1){
                System.out.println(numbers[i][0]);
            }
            else {
                System.out.println(numbers[i][0] + "." + numbers[i][1]);
            }
        }
        
    }

    public static void gptBubbleSort(){

        int index = N - 1;

        while(index > 0){
            for( int i = 0; i < index; i ++ ){
                if(numbers[i][0] == numbers[i+1][0]){
                    compareIndex1(i);
                }
                else if(numbers[i][0] > numbers[i+1][0]){
                    int tmp0 = numbers[i][0];
                    int tmp1 = numbers[i][1];

                    numbers[i][0] = numbers[i+1][0];
                    numbers[i][1] = numbers[i+1][1];

                    numbers[i+1][0] = tmp0;
                    numbers[i+1][1] = tmp1;
                }
            }
            index -- ;
        }
    }

    
    public static void compareIndex1(int i){
         if(numbers[i][1] > numbers[i+1][1]){
            int tmp0 = numbers[i][0];
            int tmp1 = numbers[i][1];

            numbers[i][0] = numbers[i+1][0];
            numbers[i][1] = numbers[i+1][1];

            numbers[i+1][0] = tmp0;
            numbers[i+1][1] = tmp1;
        }
    }
    
}
