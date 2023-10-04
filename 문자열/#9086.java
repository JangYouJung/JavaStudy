import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        String word;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while(n>0){
            word = in.next();
            System.out.print(word.charAt(0));
            System.out.print(word.charAt(word.length()-1));
            System.out.println();
            n--;
        }
    }
}