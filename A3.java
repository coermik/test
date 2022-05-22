package Assignment;

import java.util.Scanner;
//Scanner 입력함수와 다중 조건문
//3세미만 무료입장
//복지카드 국가유공자 일반할인 적용
//13세미만 특별할인적용
//17시 이후 입장 특별할인 적용
//기본입장료 10000원 특별할인 4000원 일반할인 8000원
public class A3 {
    public static void main(String[] args){
        int age = 0;
        int time = 0;
        String merit;
        String welfare;

        Scanner sc = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        time = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        merit = sc.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        welfare = sc.next();


        if (age < 3) {
            System.out.print("무료 입장");
        } else if (age < 13 || time >= 17) {
            System.out.print("입장료: 4000");
        } else if (merit.equals("y") || welfare.equals("y")) {
            System.out.println("입장료: 8000 ");
        } else {
            System.out.println("입장료: 10000");
        }


    }
}
