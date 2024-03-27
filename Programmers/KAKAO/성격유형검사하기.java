import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        char[] mbti = new char[] {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        Map< Character, Integer > MBTI = new HashMap<>();
        MBTI.put('R',0);
        MBTI.put('T',0);
        MBTI.put('C',0);
        MBTI.put('F',0);
        MBTI.put('J',0);
        MBTI.put('M',0);
        MBTI.put('A',0);
        MBTI.put('N',0);

        for( int i = 0; i < survey.length; i++ ){
            int score;
            char category;

            if( choices[i] < 4 ){ // 첫 번째 유형에 점수 추가
                category = survey[i].charAt(0);
                score = MBTI.get(category);
                score += ( 4 - choices[i] );
                MBTI.replace(category, score);
            }
            else if( choices[i] > 4 ){ // 두 번째 유형에 점수 추가
                category = survey[i].charAt(1);
                score = MBTI.get(category);
                score += ( choices[i] - 4 );
                MBTI.replace(category, score);
            }
        }

        for( char key : MBTI.keySet() ){
            System.out.println(key + ": " + MBTI.get(key));
        }

        for( int i = 0; i < mbti.length; i += 2 ){
            int a = MBTI.get( mbti[ i ] );
            int b = MBTI.get( mbti[ i + 1 ] );

            if( a >= b) stringBuilder.append(mbti[i]);
            else stringBuilder.append(mbti[i+1]);
        }

        answer = stringBuilder.toString();

        return answer;
    }
}