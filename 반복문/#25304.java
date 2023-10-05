import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       double total; //영수증에 적힌 총 금액
       total = in.nextDouble();

       int n; //영수증 항목 수
       n=in.nextInt();

       double total_sum = 0; //계산한 총 금액
       while(n>0){
           double price; //물건 가격
           price = in.nextInt();

           double count; //물건 개수
           count = in.nextDouble();

           double sum = price * count; // 물건 개수 * 가격
           total_sum+=sum;
           n--;
       }

       if(total_sum==total){
           System.out.println("Yes");
       }
       else System.out.println("No");
    }
}