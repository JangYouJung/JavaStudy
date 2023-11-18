import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){

            String input;
            ArrayList<ArrayList<String>> animals = new ArrayList<>();
            ArrayList<String> sounds = new ArrayList<>();

            //[1] 울음 소리는 sound 리스트에 저장하기
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            while(st.hasMoreTokens()){
                sounds.add(st.nextToken());
            }


            //[2] 입력 받아서 '띄어쓰기' 단위로 분리해서 sounds 1차원 배열에 저장
            while((input = br.readLine())!=null){

                if(input.equals("what does the fox say?")) break;

                ArrayList<String> array = new ArrayList<>();
                st = new StringTokenizer(input);

                while(st.hasMoreTokens()){
                    array.add(st.nextToken());
                }
                animals.add(array);

            }


            //[3] animals의 울음소리는 sounds에서 제거하기
            for(int i = 0; i<animals.size(); i++){
                //System.out.println(animals.get(i).get(0)+" : "+animals.get(i).get(2));
                sounds.removeAll(Arrays.asList(animals.get(i).get(2)));
            }

            for(String s : sounds){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }