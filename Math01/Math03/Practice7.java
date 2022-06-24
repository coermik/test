package Math01.Math03;// Practice7
// 2차원 배열 arr 을 시계방향 90도 회전시킨 결과를 출력하세요.

// 입출력 예시:
// arr:
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 결과:
// 11 6 1
// 12 7 2
// 13 8 3
// 14 9 4
// 15 10 5


public class Practice7 {
    static void printArr(int[][] arr){
        for (int[] itemID: arr) {
            for(int item: itemID){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        int[][] arr90 = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int r = arr.length - 1 - i; //1행이 마지막열 2행이 두번째 3행이 첫번째열로감
                arr90[j][r] = arr[i][j];
            }
        }

        printArr(arr);
        System.out.println("== After ==");
        printArr(arr90);
    }
}
