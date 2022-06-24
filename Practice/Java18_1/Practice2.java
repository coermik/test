package Practice.Java18_1;
import java.util.Scanner;

public class Practice2 {
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳 : ");
        int step = (int)'a' - (int)'A';
        int output = 0;
        char input = sc.nextLine().charAt(0);

        if('a'<= input && 'z'>= input){
            output = (int)input - step;
            System.out.println((char)output);
        } else if ('A'<= input && 'Z' >= input) {
            output = (int)input + step;
            System.out.println((char)output);
        } else {
            System.out.println("알파벳이 아닙니다");
        }
    }


    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }

    public static void main(String[] args) {
        reference();    // 아스키 코드 참고
        solution();
    }
}
