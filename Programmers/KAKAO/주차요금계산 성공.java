import java.util.*;

class Solution {

    Map<String, String> entryRecord = new HashMap<>(); // 입차 기록 저장 <차량번호, 입차시간>
    ArrayList<ArrayList<Integer>> totalTime = new ArrayList<>(); // 주차 시간 저장 <차량 번호, 주차 시간>

    public int[] solution(int[] fees, String[] records) {

        for( int i = 0; i < records.length; i++ ){
            String[] record = records[i].split(" ");

            if( record[2].equals("IN")){
                entryRecord.put(record[1], record[0]); // 입차 기록하기
            }
            else if( record[2].equals("OUT")){         // 출차 기록
                String[] entryTime = entryRecord.get(record[1]).split(":"); // 입차 시간 가져오기
                String[] exitTime = record[0].split(":");
                entryRecord.remove(record[1]); // 출차 했으니 입차 기록에서 삭제

                getParkingTime( Integer.parseInt( record[1]),entryTime, exitTime, fees);

            }
        }

        for( String key : entryRecord.keySet() ){ // 출차 기록이 없는 차량들
            String[] entryTime = entryRecord.get(key).split(":"); // 입차 시간 가져오기
            String[] exitTime = new String[]{"23", "59"};

            getParkingTime( Integer.parseInt(key),entryTime, exitTime, fees );
        }

        // 차량순 정렬
        int[][] array = new int[totalTime.size()][2];
        for( int i = 0; i < totalTime.size(); i++ ){
            array[i][0] = totalTime.get(i).get(0);
            array[i][1] = totalTime.get(i).get(1);
            System.out.println( array[i][0] + ": " +array[i][1]);
        }

        Arrays.sort(array, Comparator.comparingInt((int[] o) -> o[0]));

        int[] answer = new int[array.length];

        for( int i = 0; i < array.length; i++ ){
            answer[i] = getParkingFee( array[i][0], array[i][1], fees );
        }

        return answer;
    }

    public void getParkingTime( int car, String[] inTime, String[] outTime, int[] fees ){
        int hours = Integer.parseInt(outTime[0]) - Integer.parseInt(inTime[0]);
        int minutes = Integer.parseInt(outTime[1]) - Integer.parseInt(inTime[1]);

        if( minutes < 0 ){
            hours -- ;
            minutes += 60;
        }
        minutes += ( hours * 60 );

        System.out.println( car + " 총 주차시간: " + minutes);

        // 이미 주차요금 기록이 있으면 누적시키기
        boolean find = false;
        for( ArrayList<Integer> list : totalTime ){
            if(list.get(0) == car){
                int time = list.get(1);
                list.set(1,time + minutes);
                find = true;
            }
        }
        if(!find){ // 없다면 새로 넣기
            ArrayList<Integer> array = new ArrayList<>();
            array.add(car);      // 차량 번호
            array.add(minutes); // 계산된 주차 요금
            totalTime.add(array);
        }

    }

    public int getParkingFee( int car, int minutes, int[] fees ){
        int totalFee = 0 ;

        // 주차 요금 계산
        minutes -= fees[0];
        totalFee += fees[1];

        if( minutes > 0 ){
            totalFee += ( fees[3] * ( minutes / fees[2] ));
            if( minutes % fees[2] > 0) totalFee += fees[3];
        }

        System.out.println( car + " 주차비: " + totalFee );
        return totalFee;
    }
}
