import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long C = in.nextLong();

        if(C>B){
            System.out.println( A/(C-B) + 1);
        }
        else System.out.println(-1);

    }
}