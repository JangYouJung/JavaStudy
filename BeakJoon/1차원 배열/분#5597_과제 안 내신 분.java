import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> students = new LinkedHashMap<>();

        for(int i=1; i<31; i++){ //출석부 채우기
            students.put(i,0);
        }

        Scanner in = new Scanner(System.in);
        for(int i=1; i<29; i++){ //제출한 학생은 표시해두기
            int n = in.nextInt();
            students.replace(n,1);
        }

        for (Map.Entry<Integer, Integer> entry : students.entrySet()) {
            if(entry.getValue() == 0) System.out.println(entry.getKey());
        }
    }
}