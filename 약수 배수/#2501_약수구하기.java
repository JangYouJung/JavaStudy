import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();  // 약수를 구할 정수 N 입력받기
        int k = in.nextInt();  // K번째 약수를 구하기 위한 변수 K
        Vector<Integer> array = new Vector<>();

        for(int i=1; i<N+1; i++){
            if(N%i==0){
                array.add(i); // N의 약수들을 구해서 벡터에 삽입하기
            }
        }
        if(k-1<array.size()) System.out.println(array.elementAt(k-1));
        else System.out.println(0);
    }
}
