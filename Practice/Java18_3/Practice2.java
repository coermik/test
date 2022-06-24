package Practice.Java18_3;

import java.util.ArrayList;

public class Practice2 {
    public static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            //값이 음수로 되있을 수 있으니 절대값을 받음
            //배열인덱스가 0부터 시작하고 값은 1부터 시작해서 -1해줌

            if (nums[index] < 0){
                list.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
            //값이 이미 음수이면 중복번호로 인식하고 절대값으로 변경후 추가
        }
        return list;
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1, 3, 5, 5};
        System.out.println(solution(nums));
    }
}
