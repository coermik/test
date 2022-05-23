package ch01;


import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

// 입력, 출력, 달력정보,
class Cal {
    public void Ld(){
        Calendar cal = new Calendar();
    	Scanner sc = new Scanner(System.in);
        
        int year = 0;
        int month = 0;
		int day = 0;
		
		cal.set(Calendar.DATE, 1);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < firstDay; i++) {
			System.out.println("ㅁ\t");
		    }
		
        int day1[][][] = new int[12][6][7];
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