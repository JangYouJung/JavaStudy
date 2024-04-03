import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for( int i = 1; i <= number; i++ ){
            int weapon = getDivisorCnt(i);
            if( weapon > limit ) answer += power;
            else answer += weapon;
        }
        
        return answer;
    }
    

    public int getDivisorCnt( int n ){ // 주어진 정수 n의 약수의 개수를 리턴하는 함수
        int count = 0;
        
        /*
        for( int i = 1; i <= n; i++ ){
            if( n % i == 0 ) count++;
        }
        */
        
        for( int i = 1; i * i < ( n + 1 ); i++ ){
            if( n % i == 0 ){
                if( i * i == n ) count+=1;
                else count+=2;
            }
        }        
        
        return count;
        
    }
}
