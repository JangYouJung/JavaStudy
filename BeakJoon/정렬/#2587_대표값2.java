import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        //Vector<Integer> array = new Vector<>();

        int sum = 0;
        for(int i =0; i<5; i++){
            int N = in.nextInt();

            sum+=N;
            array[i] = N;
        }
        Arrays.sort(array);

        System.out.println(sum/5); //평균값
        System.out.println(array[2]);
    }
}