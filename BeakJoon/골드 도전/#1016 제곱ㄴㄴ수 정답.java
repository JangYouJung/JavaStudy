import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] sieve; // 에라토스테네스의 체
    static long min;
    static long max;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        min = Long.parseLong(st.nextToken());
        max = Long.parseLong(st.nextToken());
        sieve = new boolean[ (int)( max - min + 1 ) ];
        int count = 0;

        Eratos();

        for( int i = 0; i < sieve.length; i++ ){
            if( !sieve[i] ) count++;
        }
        System.out.println(count);

    }

    public static void Eratos(){
        for( long i = 2; i * i <= max; i++ ){
            long pow = i * i;

            long initial = ( min % pow == 0 ) ? min / pow : ( min / pow ) + 1 ;

            for( long j = initial; pow * j <= max; j++ ){
                sieve[(int)( pow * j - min )] = true;
            }
        }
    }
}
