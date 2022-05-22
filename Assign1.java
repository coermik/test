package Assignment;

import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("<<<<[메뉴 선택]>>>>");
        System.out.println("1. 회원 관리");
        System.out.println("2. 과목 관리");
        System.out.println("3. 수강 관리");
        System.out.println("4. 결제 관리");
        System.out.println("5. 종료");

        switch (i){
            case 1 :
                System.out.println("회원 관리 메뉴를 선택했습니다.");
                break;
            case 2 :
                System.out.println("과목 관리 메뉴를 선택했습니다.");
                break;
            case 3 :
                System.out.println("수강 관리 메뉴를 선택했습니다.");
                break;
            case 4 :
                System.out.println("결제 관리 메뉴를 선택했습니다.");
                break;
            case 5 :
                System.out.println("프로그램을 종료합니다");
                break;
            default:
                System.out.println("입력값이 정확하지 않습니다");
        }
//        int i1 = sc.nextInt();
//        System.out.println("회원 관리 메뉴를 선택했습니다.");
//        int i2 = sc.nextInt();
//        System.out.println("과목 관리 메뉴를 선택했습니다.");
//        int i3 = sc.nextInt();
//        System.out.println("수강 관리 메뉴를 선택했습니다.");
//        int i4 = sc.nextInt();
//        System.out.println("결제 관리 메뉴를 선택했습니다.");
//        int i5 = sc.nextInt();
//        System.out.println("프로그램을 종료합니다.");
//
//        int i6 = sc.nextInt();
//        System.out.println("입력값이 정확하지 않습니다");



//        for (int i = 0; i <= 5; i++){
//            if (i == 1) {
//                System.out.println("회원 관리 메뉴를 선택했습니다.");
//            }
//            else if (i == 2) {
//                System.out.println("과목 관리 메뉴를 선택했습니다.");
//            }
//            else if (i == 3) {
//                System.out.println("수강 관리 메뉴를 선택했습니다.");
//            }
//            else if (i == 4) {
//                System.out.println("결제 관리 메뉴를 선택했습니다.");
//            }
//            else if (i == 5) {
//                System.out.println("프로그램을 종료합니다.");
//            }
//            else{
//                System.out.println("입력값이 정확하지 않습니다");
//            }
//        }


//        a = sc.nextInt();
//        System.out.println("회원 관리 메뉴를 선택했습니다.");
//
//        b = sc.nextInt();
//        System.out.println("회원 관리 메뉴를 선택했습니다.");
//
//        c = sc.nextInt();
//        System.out.println("회원 관리 메뉴를 선택했습니다.");
//
//        d = sc.nextInt();
//        System.out.println("회원 관리 메뉴를 선택했습니다.");
//
//        e = sc.nextInt();
//        System.out.println("회원 관리 메뉴를 선택했습니다.");


    }
}
