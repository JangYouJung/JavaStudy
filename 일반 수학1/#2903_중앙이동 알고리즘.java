
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double N = in.nextInt();

        double answer = Math.pow(Math.pow(2,N)+1,2);
        System.out.println((int)answer);
    }
}