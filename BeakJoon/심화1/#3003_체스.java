import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int king = in.nextInt();
       int queen = in.nextInt();
       int rook = in.nextInt();
       int bishop = in.nextInt();
       int knight = in.nextInt();
       int pawns = in.nextInt();

        System.out.print(1-king+" ");
        System.out.print(1-queen+" ");
        System.out.print(2-rook+" ");
        System.out.print(2-bishop+" ");
        System.out.print(2-knight+" ");
        System.out.print(8-pawns+" ");
    }
}