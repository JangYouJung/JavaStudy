import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger bigN = in.nextBigInteger(); //최백준 조교가 가진 돈
        BigInteger bigM = in.nextBigInteger(); //돈을 받으러 온 생명체 수

        System.out.println(bigN.divide(bigM));
        System.out.println(bigN.remainder(bigM));
    }
}