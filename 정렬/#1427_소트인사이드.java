import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();

        Vector<Integer> array = new Vector<>();

        while(true){
            if(N==0) break;
            else{
                int n = (int)(N%10);
                array.add(n);
                N/=10;
            }
        }
        Object[] objs = array.toArray();
        /*
        Arrays.sort(objs); //오름차순 정렬
        */
        Arrays.sort(objs,Collections.reverseOrder());

        for(Object i : objs){
            System.out.print(i);
        }

    }

}