import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int n = N;

        for(int i=1; i<N+1; i++){ //1. 별이 늘어 나는 부분
            for(int j=1; j<n; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
            n--;
        }

        n=N;
        for(int i=1; i<N; i++){ //2. 별이 줄어 드는 부분
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(n-1)-1;k++){
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
    }
}