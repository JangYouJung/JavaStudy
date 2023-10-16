import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> students = new LinkedHashMap<>();
        for(int i=1; i<29; i++){
            students.put(i,0);
        }
        Scanner in = new Scanner(System.in);
        for(int i=1; i<29; i++){
            int n = in.nextInt();
            students.replace(n,1);
        }
        for (Map.Entry<Integer, Integer> entry : students.entrySet()) {
            if(entry.getValue() == 0) System.out.println(entry.getKey());
        }
    }
}