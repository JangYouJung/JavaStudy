import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 바구니 개수 입력 받기
        int M = in.nextInt(); // 교환 횟수 입력 받기

        Vector<Integer> array = new Vector<>();
        for(int i=0; i<N; i++){ //바구니 채우기
            array.add(0);
        }

        for(int j=0; j<M; j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            for(int i = a-1; i<b; i++){
                array.set(i,c);
            }
        }

        for(int i=0; i<N; i++){ //배열 출력
            System.out.print(array.elementAt(i)+ " ");
        }
    }
}