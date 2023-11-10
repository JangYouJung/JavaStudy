import java.util.Scanner;
import java.util.Vector;

class Solution
{
	public static void main(String args[]) throws Exception{

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // (1) N 입력 받기
        Vector<Integer> numbers = new Vector<>(); 

        for(int i = 1; i < N + 1; i++){

            int tmp = i;
            boolean flag =  false;

            while( tmp > 0 ){ //(2) 1~N까지 정수를 각 자릿수로 분리해 벡터에 삽입

                numbers.add(tmp % 10);
                tmp /= 10;

            }

            for(int each_num : numbers){ //(3) 벡터 각 숫자 3의 배수면 박수 출력 

                if(each_num % 3 == 0 && each_num != 0 ){ // 예외 !!!!! 0은 3의 배수가 아니다 !!
                    flag = true ; // 3의 배수임을 표시
                    System.out.print("-");
                }

            }
            if(!flag){ //(4) 3의 배수 하나도 안들어간 경우 그대로 출력 : flag 로 체크

                System.out.print(i);

            }

            System.out.print(" ");
            numbers.clear(); //(5) 벡터는 초기화해주기
        }

    }

}