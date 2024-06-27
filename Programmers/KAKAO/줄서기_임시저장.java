import java.util.*;

class Solution {

    static int[] tree; // 각 노드의 순서를 담는 트리 배열
    static ArrayList<Integer> PREORDER = new ArrayList<>();
    static ArrayList<Integer> POSTORDER = new ArrayList<>();
    static List<Integer> levels;

    // key는 각 node의 y좌표, Value는 nodeinfo에서 인덱스
    static HashMap<Integer, Queue<int[]>> map = new HashMap<>();

    public static  int[][] solution(int[][] nodeinfo) {

        // 1. 트리 크기 구하기 + 같은 레벨에 있는 노드끼리 묶기
        for( int i = 0; i < nodeinfo.length; i++ ){

            // 각 노드의 순서(인덱스 + 1), x좌표, y좌표
            int[] array = new int[]{ i+1, nodeinfo[i][0], nodeinfo[i][1] };

            // map 채우기
            if( !map.isEmpty() & map.containsKey(nodeinfo[i][1])){
                map.get(nodeinfo[i][1]).add(array);
            }
            else{
                Queue<int[]> queue = new LinkedList<>();
                queue.add(array);
                map.put(nodeinfo[i][1], queue);
            }

        }

        int size = (int) ( Math.pow( 2 , map.size() ) - 1);
        tree = new int[ size ];
        levels = map.keySet().stream().toList();

        for( int i = levels.size() - 1; i > 0; i-- ){ // 인덱스 0 은 리프 노드

            Queue<int[]> current_level = map.get(levels.get(i));

            while(!current_level.isEmpty()){
                int[] current_node = current_level.poll();


                
            }

            // 자식 노드 찾기
            find_children()

        }


        //return new int[][] { PREORDER, POSTORDER };
        return new int[][] { };

    }

    static public boolean find_children( int[] candidate, int[] parent ){


    }



    static public void init( int index, int level ){



    }


    static public void makePreOrder( int index){

        if( tree[index] == 0 ) return;

        PREORDER.add(tree[index]);
        makePreOrder(index * 2 );
        makePreOrder( index * 2 + 1);
        
    }
    static public void makePostOrder( ){

    }


    public static void main(String[] args) throws Exception {
        int[][] nodeinfo = new int[][]{
                {5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}
        };

        solution(nodeinfo);

    }



}
