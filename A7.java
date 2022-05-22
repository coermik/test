package Assignment;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int lotto[] = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            int num = (int) (Math.random() * 45) + 1;
            System.out.println(lotto[i]);
        }
        int lot;

        System.out.println("[로또 당첨 프로그램]");
        System.out.println("로또 개수를 입력해 주세요.(숫자1 ~10)");

    }
}
