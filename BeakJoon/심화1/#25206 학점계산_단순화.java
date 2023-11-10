import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {

        Vector<Double> credit = new Vector<>(); // 각 과목의 이수 학점 저장
        double sum_credit = 0;
        double total_sum = 0;
        Scanner in = new Scanner(System.in);

        for(int i=0; i<20; i++){
            String s = in.nextLine();
            String[] line = s.split(" ");
            credit.add(Double.valueOf(line[1]).doubleValue());

            double score = 10;
            switch (line[2]){
                case "A+":
                    score = 4.5;
                    break;
                case "A0":
                    score = 4.0;
                    break;
                case "B+":
                    score = 3.5;
                    break;
                case "B0":
                    score = 3.0;
                    break;
                case "C+":
                    score = 2.5;
                    break;
                case "C0":
                    score = 2.0;
                    break;
                case "D+":
                    score =  1.5;
                    break;
                case "D0":
                    score = 1.0;
                    break;
                case "F":
                    score = 0.0;
                    break;
            }

            if(score != 10){ // 즉 학점이 P or NP인 경우 제외
                sum_credit+=Double.parseDouble(line[1]);
                total_sum += Double.parseDouble(line[1]) * score;
            }
        }

        System.out.printf("%.6f",total_sum/sum_credit);
    }
}