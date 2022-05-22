package Assignment;

import java.util.Scanner;

//    nextint()함수 사용

class Random {

    public void printRand() {

        int rand[] = new int[6];	//

        for(int i = 0; i < rand.length; i++) {
            int num = (int) (Math.random() * 10);    //
            rand[i] = num;
            System.out.print(rand[i]);
        }
    }
}

public class A4 {
    public static void main(String[] args) {
        int year;
        int month;
        int day;
        String mf;
        Scanner sc = new Scanner(System.in);

        Random r1 = new Random();

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        year = sc.nextInt();
        System.out.print("출생월을 입력해 주세요.(mm):");
        month = sc.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd):");
        day = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        mf = sc.next();
        System.out.printf("%2d%02d%d-", year, month,day);
        if(mf.equals("m")){
            System.out.print("3");
        } else if (mf.equals("f")) {
            System.out.print("4");
        }
        r1.printRand();
    }
}
