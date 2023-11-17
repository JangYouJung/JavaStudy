import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        //[1] 2차원 배열 선언과 동시에 모든 값이 0으로 초기화 된다.
        int[][] array = new int[a.length()+1][b.length()+1];

        int max = 0;
        for( int i = 0; i < a.length(); i++ ){
            for(int j = 0; j < b.length(); j++){
                //[2] 서로 같은 문자 찾으면 배열에서 해당 값을 대각선 누적시킨다.
                if(a.charAt(i)==b.charAt(j)){
                    array[i+1][j+1] = array[i][j] + 1;
                    if(max<array[i+1][j+1]) max = array[i+1][j+1];
                }
            }
        }


        /* 테스트용 2차원 배열 값 확인용 콘솔 출력문*/
        for( int i = 0; i < a.length(); i++ ){
            for(int j = 0; j < b.length(); j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        /* 제출시 여기는 삭제 */


        System.out.println(max);

    }
}
