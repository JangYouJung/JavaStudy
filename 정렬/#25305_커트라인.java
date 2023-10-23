import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();


        Integer arr[] = new Integer[N];
        for(int i=0; i<N; i++){
            int n=in.nextInt();
            arr[i] = n;
        }

        Arrays.sort(arr,Comparator.reverseOrder());

        System.out.println(arr[K-1]);

    }
}