import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int max = 0;
        int x=0, y=0;

        //Vector<Vector<Integer>> doubleArray= new Vector<>();
        for(int i=0; i<9; i++){
            //Vector<Integer> array = new Vector<>();
            for(int j=0; j<9; j++){
                int n = in.nextInt();
                if(n>max) {
                    max=n;
                    x = i + 1;
                    y = j + 1;

                }

                //array.add(n);
            }
            //doubleArray.add(array);
        }
        System.out.println(max);
        System.out.print(x+" "+y);
    }
}