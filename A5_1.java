package ch01;
import java.util.*;

public class A5_1 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[�޷� ��� ���α׷�]");
		System.out.print("�޷��� �⵵�� �Է��� �ּ���.(yyyy):");
		int year = sc.nextInt();
		System.out.print("�޷��� ���� �Է��� �ּ���.(mm):");
		int month = sc.nextInt(); 

		cal.set(Calendar.YEAR, year); 
		cal.set(Calendar.MONTH, month);

		System.out.println("[" + year + "�� "+ month + "��]");
		System.out.println(" �� "+"  �� "+" ȭ "+"  �� "+" �� "+"  �� "+" �� ");

		cal.set(year,month-1,1); //�Է¹��� ���� 1�Ϸ� ����
		                         //month�� 0�� 1���̹Ƿ� -1�� ���ش�
		  
		int end = cal.getActualMaximum(Calendar.DATE);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); 
		

		for(int i=1; i<=end; i++) {
			if(i==1) {
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if(i<10) {
				System.out.print(" ");
			}
			System.out.print(" "+i+" ");
			if(dayOfWeek%7==0) {
				System.out.println();
			}
			dayOfWeek++;
		}
		
		
		
	}
} 