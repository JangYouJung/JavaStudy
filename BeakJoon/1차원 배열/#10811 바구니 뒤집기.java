import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Vector<Integer> array = new Vector<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for(int i=1; i<N+1; i++){ // 1. 바구니 개수에 맞게 공 채우기
            array.add(i);
        }

        int M = in.nextInt();
        for(int j=0; j<M; j++){ // 2. 바구니 뒤집기
            int first = in.nextInt();
            int second = in.nextInt();
            reverse_sort(first,second);
        }

        for(int i=0; i<N; i++){ // 3. 뒤집어진 바구니 출력
            System.out.print(array.elementAt(i)+" ");
        }
    }

    public static void reverse_sort(int first, int second){
        int tmp = array.elementAt(first-1);
        array.set(first-1, array.elementAt(second-1));
        array.set(second-1, tmp);

        if(second - first > 2) reverse_sort(first+1, second-1);
    }
}