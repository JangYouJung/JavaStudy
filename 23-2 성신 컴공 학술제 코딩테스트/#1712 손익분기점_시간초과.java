import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong();
        long B = in.nextLong();
        long C = in.nextLong();

        long i = 1;

        while(true){
            if(A + B * i < C * i){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}