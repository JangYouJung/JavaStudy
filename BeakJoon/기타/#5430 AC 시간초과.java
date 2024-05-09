import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bf.readLine());

        for( int i = 0; i<T; i++ ){
            String s = bf.readLine();
            int N = Integer.parseInt(bf.readLine());
            String input = bf.readLine();


            ArrayList<Integer> list = new ArrayList<>();
            //Deque<Integer> deque = new LinkedList<>();

            if( N == 0 ){
                if(s.contains("D")) System.out.println("error");
                else System.out.println("[]");
                continue;
            }

            for( int j = 1; j < input.length(); j++ ){
                StringBuilder number = new StringBuilder();

                while (input.charAt(j) != ',' && input.charAt(j) != ']') {
                    number.append(input.charAt(j));
                    j++;
                }

                list.add( Integer.parseInt(number.toString()));
                //deque.offer(Integer.parseInt(number.toString()));
            }

            boolean error = false;
            boolean reverse = false;

            for( int j = 0; j<s.length(); j++ ){
                if( s.charAt(j)=='R'){ // 뒤집기
                    reverse = !reverse;
                }
                else{
                    if(!reverse){
                        for( int k = 0; k < list.size(); k++ ){
                            if( list.get(k) != 0 ){
                                list.set(k, 0);
                                break;
                            }
                            else if( k == list.size() - 1 ) error = true;
                        }
                    }
                    else {
                        for( int k = list.size()-1; k > -1; k-- ){
                            if( list.get(k) != 0 ){
                                list.set(k, 0);
                                break;
                            }
                            else if( k == 0 ) error = true;
                        }
                    }
                }
            }

            if(error) System.out.println("error");
            else{
                System.out.print("[");

                StringBuilder result = new StringBuilder();
                if(!reverse){
                    for (int n : list) {
                        if (n == 0) continue;
                        result.append(n).append(",");
                    }
                }
                else {
                    for( int j = list.size()-1; j > -1; j-- ){
                        int n = list.get(j);
                        if( n == 0 ) continue;
                        result.append(list.get(j)).append(",");
                    }
                }

                if(result.length()>0) result.deleteCharAt(result.length()-1);
                System.out.print(result);
                System.out.println("]");
            }

        }

    }// end of main

}// end of class
