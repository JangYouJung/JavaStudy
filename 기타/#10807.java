import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 정수 개수 입력 받기

        Vector<Integer> array = new Vector<>();
        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            array.add(a);
        }

        int k = in.nextInt();
        int answer = 0;
        for(int i = 0; i<n; i++){
            if(k==array.elementAt(i)) answer++;
        }

        System.out.println(answer);
    }
}