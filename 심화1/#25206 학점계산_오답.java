import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Vector<Double> Score = new Vector<>();
        Vector<Vector<Double>> transcript = new Vector<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = br.readLine()) != null) { // 1. 입력 받기
            String[] words = str.split(" ");
            Score.add(Double.valueOf(words[1]).doubleValue());

            if(words[2]=="A+" || words[2]=="P") Score.add(4.5);
            else if(words[2]=="A0") Score.add(4.0);
            else if(words[2]=="B+") Score.add(3.5);
            else if(words[2]=="B0") Score.add(3.0);
            else if(words[2]=="C+") Score.add(2.5);
            else if(words[2]=="C0") Score.add(2.0);
            else if(words[2]=="D+") Score.add(1.5);
            else if(words[2]=="D0") Score.add(1.0);
            else Score.add(0.0);

            transcript.add(Score);
        }

        double total_sum = 0; // 분자값
        double credit_sum = 0; // 분모값
        for(int i=0; i<transcript.size(); i++){
            total_sum += transcript.elementAt(i).elementAt(0)
                        * transcript.elementAt(i).elementAt(1);
            credit_sum += transcript.elementAt(i).elementAt(0);
        }
        System.out.println(total_sum/credit_sum);
    }
}