import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> BigArray = new Vector<>();

        Scanner in = new Scanner(System.in);
        int max = 0;
        for(int i=0; i<5; i++){
            String string= in.nextLine();
            if(max<string.length()) max = string.length();
            BigArray.add(string);
        }

        for(int i=0; i<max; i++){
            for(int j =0; j<5; j++){
                if(i<BigArray.elementAt(j).length()){
                    System.out.print(BigArray.elementAt(j).charAt(i));
                }
            }
        }
    }
}