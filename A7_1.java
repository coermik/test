package ch01;

import java.util.Scanner;

public class A7_1 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("[�ζ� ��÷ ���α׷�]");
        System.out.print("�ζ� ������ �Է��� �ּ���.(���� 1 ~ 10):");
        int set = sc.nextInt();
        int cnt = 1;
        int num;
        char ch = 'A';
        
        while (set > 0) {
 
            int[] nums = new int[6];
            for (int i = 0; i < nums.length; i++) {
                int temp = (int) (Math.random() * 45) + 1;
                nums[i] = temp;
 
                // �ߺ�����
                for (int j = 0; j < i; j++) {
                    if (nums[j] == temp) {
                        i--;
                        break;
                    }
                }
 
            }
            
//            for(int j = 1; j <= set; j++) {
//            	int n = 64 + j;
//            	char n1 = (char)n;
//            	System.out.print(n1 + "   ");
//            }	
//            System.out.print("\n"+ cnt + "��° : " );
            for(int m=1; m <= set; m++ ) {
            	 
            	System.out.print(ch+"  ");
            	ch += m;
            	for (int k = 0; k < nums.length; k++) {
                  	
                    System.out.print(nums[m]);
            	}    
            }
            
        	
//            for (int k = 0; k < nums.length; k++) {
//            	
//                System.out.print(nums[k]);
//                if (k + 1 == nums.length) { // ������ i�� ����
//                	  System.out.print(nums[k]);
//                	} else {
//                	  System.out.printf(k+" ");
//                	}
//            }
            set--;
            cnt++;
        } // while end
    }
}