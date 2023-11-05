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


            switch (line[2]){
                case "A+":
                    sum_credit+=Double.parseDouble(line[1]);
                    total_sum += Double.parseDouble(line[1]) * 4.5;
                    break;
                case "A0":
                    sum_credit+=Double.parseDouble(line[1]);
                    total_sum += Double.parseDouble(line[1]) * 4.0;
                    break;
                case "B+":
                    sum_credit+=Double.parseDouble(line[1]);
                    total_sum += Double.parseDouble(line[1]) * 3.5;
                    break;
                case "B0":
                    sum_credit+=Double.parseDouble(line[1]);
                    total_sum += Double.parseDouble(line[1]) * 3.0;
                    break;
                case "C+":
                    sum_credit+=Double.parseDouble(line[1]);
                    total_sum += Double.parseDouble(line[1]) * 2.5;
                    break;
                case "C0":
                    sum_credit+=Double.parseDouble(line[1]);
                    total_sum += Double.parseDouble(line[1]) * 2.0;
                    break;
                case "D+":
                    sum_credit+=Double.parseDouble(line[1]);
                    total_sum += Double.parseDouble(line[1]) * 1.5;
                    break;
                case "D0":
                    sum_credit+=Double.parseDouble(line[1]);
                    total_sum += Double.parseDouble(line[1]);
                    break;
                case "F":
                    sum_credit+=Double.parseDouble(line[1]);
                    break;
            }

        }

        System.out.printf("%.6f",total_sum/sum_credit);
    }
}