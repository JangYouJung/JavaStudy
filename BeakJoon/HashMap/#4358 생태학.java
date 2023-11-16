import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //[1] 입력을 위한 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;

        //[2] 각 나무들의 종과 나온 횟수를 저장하는 HashMap 선언
        HashMap<String, Integer> trees = new HashMap<>();

        //[3] 나무들 입력 받기
        String input;
        while ((input = br.readLine()) != null) { //나무 해쉬맵 갱신하기
            total ++ ;
            if(trees.containsKey(input)){ // 이미 존재하는 나무라면 count + 1
                trees.put(input, trees.get(input)+1);
            }
            else trees.put(input,1);
        }

        //[4] 사전순 정렬
        Map<String, Integer> sortedMap = new TreeMap<>(trees);

        double finalTotal = total;
        sortedMap.forEach((tree, count) ->
                System.out.println(tree+" "+String.format("%.4f",(double)count * 100 / (double)finalTotal))
        );
    }
}