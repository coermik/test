package Assignment;

import java.util.Scanner;

// 입력, 출력, 달력정보,
class Cal {
    public void Ld(){
        Scanner sc = new Scanner(System.in);

        int day[][][] = new int[12][6][7];
        String[] week = {"일","월","화","수","목","금","토"};



    }
}
public class A5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year;
        int month;

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        year = sc.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        month = sc.nextInt();
        System.out.println(String.format("[%4d년 %02d월]",year,month));

    }
}
