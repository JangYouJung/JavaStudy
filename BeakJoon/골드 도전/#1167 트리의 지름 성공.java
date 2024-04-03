import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static ArrayList<Node>[] Tree;
    static boolean[] visited;
    static int max = 0;
    static int max_node;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(bf.readLine());
        Tree = new ArrayList[N];

        for( int i = 0; i < N; i++ ){
            Tree[i] = new ArrayList<>();
        }

        for( int i = 0; i < N; i++ ){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int vertex = Integer.parseInt(st.nextToken());
            while(true){
                int neighbor = Integer.parseInt(st.nextToken());
                if( neighbor == -1 ) break;
                int distance = Integer.parseInt(st.nextToken());

                Node node = new Node((neighbor-1 ), distance );
                Tree[vertex - 1 ].add(node);
            }
        }

        visited = new boolean[N];
        dfs(0,0);

        visited = new boolean[N];
        dfs(max_node, 0);

        System.out.println(max);

    }


    public static void dfs( int v, int cost ){
        if( max < cost ){
            max = cost;
            max_node = v;
        }
        visited[v] = true;

        for( int i = 0; i < Tree[v].size(); i++ ){
            Node node = Tree[v].get(i);
            if(!visited[ node.vertex ]){
                dfs( node.vertex, cost + node.distance );
                visited[ node.vertex ] = true;
            }
        }
    }

    public static class Node {
        int vertex;
        int distance;

        public Node ( int vertex, int distance ){
            this.vertex = vertex;
            this.distance = distance;
        }
    }
}
