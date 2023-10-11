import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Vector<String> answers = new Vector<>();

        while(true){
            int A = in.nextInt();
            int B = in.nextInt();

            if(A == 0) break;
            else{
                answers.add(judgement(A,B));
            }
        }

        for(int i=0; i<answers.size(); i++){
            System.out.println(answers.get(i));
        }
    }
    public static String judgement(int A, int B){
        String s;
        if(A>B){
            if(A%B==0) return "multiple";
            else return "neither";
        }
        else{
            if(B%A==0) return "factor";
            else return "neither";
        }
    }
}