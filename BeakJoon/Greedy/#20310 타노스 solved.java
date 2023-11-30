import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        // 0의 개수 = num0
        int num0 = 0;

        //1의 개수 = num1
        int num1 = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            sb.append(c);
            if( c == '0') num0 ++;
            else num1 ++;
        }


        // num0, num2 각각 절반값으로 교체
        num0/=2;
        num1/=2;


        // 1은 앞에서 없애기
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i)=='1') {
                //System.out.println("1삭제 발생! index: "+i);
                sb.setCharAt(i,'2');
                num1 --;
            }
            if(num1 == 0) break;
        }

        // 0은 뒤에서부터 없애기
        for(int i = sb.length()-1; i > -1; i--){
            if(sb.charAt(i)=='0') {
                sb.setCharAt(i,'2');
                num0 --;
            }
            if(num0 == 0) break;
        }

        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i) == '1' | sb.charAt(i) == '0') System.out.print(sb.charAt(i));
        }
    }
}