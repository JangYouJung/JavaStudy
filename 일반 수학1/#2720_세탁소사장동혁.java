
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        Vector<Vector<Integer>> Changes= new Vector<>();
        for(int i=0; i<N; i++){
            Vector<Integer> change = new Vector<>();

            int input = in.nextInt();
            int Quarter = input / 25;
            change.add(Quarter);

            int firstRemain = input % 25;
            int Dime = firstRemain / 10;
            change.add(Dime);

            int secondRemain = firstRemain % 10;
            int Nickel = secondRemain / 5;
            int Penny = secondRemain % 5;
            change.add(Nickel);
            change.add(Penny);

            Changes.add(change);
        }

        for(Vector v : Changes){
            System.out.println(v.elementAt(0)+ " " + v.elementAt(1)
                               + " " + v.elementAt(2) + " "
                                + v.elementAt(3));
        }

    }
}