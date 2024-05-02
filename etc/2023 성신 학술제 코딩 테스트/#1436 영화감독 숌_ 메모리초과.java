import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int count = 1;
        int i = 667;

        while(true){
            String s = Integer.toString(i);
            if(s.contains("666")) {
                count++;
                if(count == N){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}