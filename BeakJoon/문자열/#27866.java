import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. 변수 선언
        String word; //단어 저장
        int index; // 인덱스 저장

        //2. 각 변수 입력 받기
        Scanner in = new Scanner(System.in);
        word = in.next(); 
        index = in.nextInt();

        //3. 단어의 '인덱스 - 1'번째 문자 출력
        System.out.println(word.charAt(index-1));
    }
}
