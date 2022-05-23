
import java.util.Scanner;
//    백엔드 2기 김다현
public class JavaStudy02 {

    public static void main(String[] args){
        int cash;
        int cashBack = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해주세요. (금액):");
        cash = sc.nextInt();
        cashBack = cash / 10;

        if (cashBack >= 100 && cashBack < 200){
            cashBack = 100;
            System.out.println(String.format("결제금액은 %d 원이고, 캐시백은 %d 입니다.", cash, cashBack));
        } else if (cashBack >= 200 && cashBack < 300) {
            cashBack = 200;
            System.out.println(String.format("결제금액은 %d 원이고, 캐시백은 %d 입니다.", cash, cashBack));
        } else if (cashBack >= 300){
            cashBack = 300;
            System.out.println(String.format("결제금액은 %d 원이고, 캐시백은 %d 입니다.", cash, cashBack));
        } else{
            cashBack = 0;
            System.out.println(String.format("결제금액은 %d 원이고, 캐시백은 %d 입니다.", cash, cashBack));
        }
    }
}
