package Practice.Java18_1;


public class Practice4 {
    public static void solution(int n, int type) {
        if(type == 1){
            type1(n);
        } else if (type == 2) {
            type2(n);
        } else if (type == 3) {
            type3(n);
        } else if (type == 4) {
            type4(n);
        } else if (type == 5) {
            type5(n);
        }
    }


    public static void type1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void type2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void type3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) { // 공백
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) { // 별
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void type4(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void type5(int n){
        for (int i = 0; i <= n/2; i++) {
            for (int j = 0; j < n / 2 - i; j++) { // 3, 2, 1
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) { // 1,3,5,7
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n/2; i > 0; i--) {
            for (int j = 0; j < n/2 + 1 - i; j++) {// 1,2,3
                System.out.print(" ");
            }
            for (int j = 0; j < i*2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // Test code
        solution(3, 1);
        solution(3, 2);
        solution(3, 3);
        solution(3, 4);
        solution(7, 5);
    }
}
