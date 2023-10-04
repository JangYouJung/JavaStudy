import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;
        int index;

        Scanner in = new Scanner(System.in);
        word = in.next();
        index = in.nextInt();

        System.out.println(word.charAt(index-1));
    }
}