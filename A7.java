package ch01;

import java.util.Scanner;

public class A7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int lotto[] = new int[6];
        int lotNum;
//        int n = 65 ;
//        char test;
        
        System.out.println("[�ζ� ��÷ ���α׷�]");
        System.out.print("�ζ� ������ �Է��� �ּ���.(����1 ~10):");
        lotNum = sc.nextInt();
        for(int i = 1; i <= lotNum; i++) {
        	int n = 64 + i;
        	char test = (char)n;
        	System.out.print(test + "  ");
        	
        }
        for (int j = 1; j <= 6; j++) {
            int num = (int) (Math.random() * 45) + 1;
            System.out.print(num + " ");
            
     	}
        System.out.println();
//        for() //�ζ� ���;
        System.out.println("[�ζ� ��ǥ]");
        for (int k = 0; k <= 6; k++) {
            int num1 = (int) (Math.random() * 45) + 1;
            System.out.print(num1);
        }    
    }
    	

   
}