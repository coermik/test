
import java.util.Scanner;
//    백엔드 2기 김다현
public class JavaStudy03 {
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
