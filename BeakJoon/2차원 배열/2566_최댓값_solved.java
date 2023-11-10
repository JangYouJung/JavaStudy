import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Vector<Vector<Integer>> doubleArray= new Vector<>();

        for(int i=0; i<9; i++){
            Vector<Integer> array = new Vector<>();

            for(int j=0; j<9; j++){
                int n = in.nextInt();
                array.add(n);
            }
            doubleArray.add(array);
        }

        int max = 0;
        int x=1, y=1;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(doubleArray.elementAt(i).elementAt(j)>max){
                    max = doubleArray.elementAt(i).elementAt(j);
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.print(x+" "+y);
    }
}