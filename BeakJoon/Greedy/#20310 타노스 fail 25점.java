import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        // 0의 개수 = num0
        int num0 = 0;

        //1의 개수 = num1
        int num1 = 0;

        for(int i = 0; i < s.length(); i++){
            if( s.charAt(i)== '0') num0 ++;
            else num1 ++;
        }

        // num0, num2 각각 절반값으로 교체
        num0/=2;
        num1/=2;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i =0; i<num0 ; i++){
            stringBuilder.append('0');
        }
        for(int i =0; i<num1 ; i++){
            stringBuilder.append('1');
        }

        System.out.println(stringBuilder);

    }
}
