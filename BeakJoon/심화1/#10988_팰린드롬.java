import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static String word;
    public static boolean Palindrom = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        word = in.nextLine();

        check_Palindrom(0,word.length()-1);

        if(Palindrom) System.out.println(1);
        else System.out.println(0);
    }

    public static void check_Palindrom(int first, int last){
        if(word.charAt(first)==word.charAt(last)){
            if(last - first > 2) check_Palindrom(first+1 , last -1);
        }
        else Palindrom = false;
    }
}