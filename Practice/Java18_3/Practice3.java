package Practice.Java18_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Practice3 {
    public static void solution(int[] arr, int k, int x) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        //Integer에는 절대값 차이값
        //해당 절대값 차이 해당값을 쭉 이어줄거임

        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(x - arr[i]);

            ArrayList<Integer> cur = map.get(diff);
            if(cur == null){
                map.put(diff, new ArrayList<>(Arrays.asList(arr[i])));
            }else{
                int idx = cur.size();
                for (int j = 0; j < cur.size(); j++) {
                    if (cur.get(j) > arr[i]){
                        idx = j;
                        break;
                    }
                }
                cur.add(idx, arr[i]);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int cnt = 0;
        while(map.size() > 0){
            int minDiff = map.keySet().stream().min((a,b) -> a - b).get();
            //받아서 for문사용가능 but 스트림이용한 문장 활용 / 가장 낮은값 찾기
            ArrayList<Integer> cur = map.get(minDiff);
            //minDiff해당 값을 가져옴
            map.remove(minDiff);
            //값은 꺼내왔으니 기존 맵에서 해당위치의 값은 삭제
            while (cur.size() > 0){
                result.add(cur.get(0));
                cur.remove(0);
                cnt++;

                if(cnt == k){
                    break;
                }
            }
            if(cnt == k){
                break;
            }

        }
        Collections.sort(result); //하나하나 작은수부터 배치해도됨ㅊ
        System.out.println(result);
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr, 4, 3);

        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        solution(arr, 5, 5);

        arr = new int[]{2, 4};
        solution(arr, 1, 3);

        arr = new int[]{2, 4};
        solution(arr, 3, 3);
    }
}
