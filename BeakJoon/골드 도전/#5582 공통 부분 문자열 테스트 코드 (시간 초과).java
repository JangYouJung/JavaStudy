import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        System.out.println("hi");
        ArrayList<Character> a_list = new ArrayList<>();
        ArrayList<Character> b_list = new ArrayList<>();

        a.chars().mapToObj(i -> (char)i).forEach(i->a_list.add(i));
        b.chars().mapToObj(i -> (char)i).forEach(i->b_list.add(i));

        int max = 0;

        for(int i = 0; i < a_list.size(); i++){
            for(int j = 0; j < b_list.size(); j++){

                // 공통 문자 하나라도 찾으면, 공통 문자열 길이 찾는 함수 실행
                if(a_list.get(i).equals(b_list.get(j))){
                    System.out.println("-----------------");
                    int tmpI = i;
                    int tmpJ = j;
                    ///////
                    System.out.println("HIT: "+a_list.get(tmpI));

                    int length = 0;
                    while(tmpI < a_list.size() && tmpJ < b_list.size()){
                        System.out.println("i = "+tmpI+" j = "+tmpJ);
                        //////////
                        if(a_list.get(tmpI).equals(b_list.get(tmpJ))){
                            length++;
                            tmpI ++;
                            tmpJ ++;
                        }
                        else break;
                    }
                    System.out.println("lenght: "+length);
                    if(length>max) max = length;
                }


            }
        }

        System.out.println(max);

    }
}
