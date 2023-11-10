import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1; i<10; i++){
            int result = N*i;
            System.out.println(N + " * "+ i + " = "+ result);
        }
    }
}