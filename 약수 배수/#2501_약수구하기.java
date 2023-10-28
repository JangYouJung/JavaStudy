import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        int k = in.nextInt();
        Vector<Integer> array = new Vector<>();

        for(int i=1; i<N+1; i++){
            if(N%i==0){
                array.add(i);
            }
        }
        if(k-1<array.size()) System.out.println(array.elementAt(k-1));
        else System.out.println(0);
    }
}