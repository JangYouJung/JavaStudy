import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int score=in.nextInt();//시험 점수
        
        if(score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score>=70) {
            System.out.println("C");
        } else if (score>=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}