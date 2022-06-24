package Practice.Java18_1;

public class Practice5 {
    public static int solution(int[] height) {
        int left = 0; //왼쪽벽의 인덱스
        int right = height.length - 1; //가장끝쪽 인덱스
        int maxArea = 0; //가장큰면적을 담아둠

        while (left < right) {
            int x = (right - left);
            int y = height[left] < height[right] ? height[left] : height[right];
            int curArea = x * y;
            maxArea = maxArea > curArea ? maxArea : curArea;

            //위의 삼항연산자와 다른 코드
            curArea = x * Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea, curArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        // Test code
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));

    }
}
