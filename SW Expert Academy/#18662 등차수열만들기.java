import java.util.Scanner;
class Solution {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            
            double a = y - x;
            double b = z - y;

            //gap = 등차수열의 공차
            double gap = (a + b) / 2;

            //original = x + gap, 즉 y의 올바른 값
            double original = x + gap ;
            
            double answer = y - original;

            if(answer<0) answer *= -1;

            System.out.println("#"+test_case+" "+answer);
        }
    }
}