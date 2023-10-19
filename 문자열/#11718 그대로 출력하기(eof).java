import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        Vector<String> Page = new Vector<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            Page.add(str);
        }
        for(int i=0; i<Page.size(); i++){
            System.out.println(Page.elementAt(i));
        }
    }
}