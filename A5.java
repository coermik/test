package ch01;


import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

// �Է�, ���, �޷�����,
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
			System.out.println("��\t");
		    }
		
        int day1[][][] = new int[12][6][7];
        String[] week = {"��","��","ȭ","��","��","��","��"};



    }
}
public class A5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year;
        int month;

        System.out.println("[�޷� ��� ���α׷�]");
        System.out.print("�޷��� �⵵�� �Է��� �ּ���.(yyyy):");
        year = sc.nextInt();
        System.out.print("�޷��� ���� �Է��� �ּ���.(mm):");
        month = sc.nextInt();
        System.out.println(String.format("[%4d�� %02d��]",year,month));
        
    }
}