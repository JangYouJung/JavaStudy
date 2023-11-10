import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;
        Scanner in = new Scanner(System.in);
        word = in.next();
        System.out.println(word.length());//java에서는 string의 특정 인덱스에 접근할 때, 'length()'메서드를 사용한다!
    }
}
