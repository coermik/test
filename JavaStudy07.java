import java.util.Scanner;
//    백엔드 2기 김다현
public class JavaStudy07 {
    public static void main(String args[]) {
        Lotto lot = new Lotto();
        lot.run();
    }
}

class Lotto{
    private int[][] lotto = new int[10][6];
    private int[][] thisWeekNumber = new int [1][6];
    private int[] sumOfNumber = new int [10];
    private int num;
    Scanner scan = new Scanner(System.in);

    public void run() {
        System.out.println("[로또 당첨 프로그램]");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        num = scan.nextInt();
        lottoList(num);
        thisWeekLotto(1);
        numCounter();
        lottoPrint();
    }

    private void numCounter(){
        for(int i= 0; i < num; i++){
            for(int j = 0; j <= 5; j++){
                for(int k = 0; k <= 5; k++){
                    if(thisWeekNumber[0][j] == lotto[i][k]){
                        sumOfNumber[i] += 1;
                    }
                }
            }
        }
    }

    private void lottoPrint()
    {
        for(int i = 0; i < num; i++){
            System.out.printf("%s   ", (char)(65 + i));
            for(int j = 0; j <= 5; j++){
                if(j != 5) { System.out.printf("%02d ,", lotto[i][j]);
                }
                else { System.out.printf("%02d", lotto[i][j]);
                }
            }
            System.out.printf("\n");
        }
        System.out.println("\n[로또 발표]");
        for(int i = 0; i <= 5; i++){
            if (i != 5) { System.out.printf("%02d ,", thisWeekNumber[0][i]);
            }
            else { System.out.printf("%02d", thisWeekNumber[0][i]);
            }
        }
        System.out.println();

        System.out.println("\n[내 로또 결과]");
        for(int i = 0; i < num; i++){
            System.out.printf("%s   ", (char)(65 + i));
            for(int j = 0; j <= 5; j++){
                if(j != 5) { System.out.printf("%02d ,", lotto[i][j]);
                }
                else { System.out.printf("%02d", lotto[i][j]);
                }
            }
            System.out.printf(" => %d개 일치\n", sumOfNumber[i]);
        }
    }

    private int generateNumber() {
        int tempNum;
        tempNum = (int)(Math.random() * 45) + 1;
        return tempNum;
    }

    private void lottoList (int num) {
        for(int i = 0; i < num; i++){
            while(true){
                int counter = 0;
                for(int j = 0; j <= 5; j ++){
                    lotto[i][j] = generateNumber();
                }
                for(int j = 1; j <= 5; j++){
                    for(int k = 0; k < j; k++){
                        if(lotto[i][j] == lotto[i][k]){
                            counter++;
                        }
                    }
                }
                if(counter == 0){
                    break;
                }
            }
        }
    }

    private void thisWeekLotto (int num) {
        for(int i = 0; i < num; i++){
            while(true){
                int counter = 0;
                for(int j = 0; j <= 5; j ++){
                    thisWeekNumber[i][j] = generateNumber();
                }
                for(int j = 1; j <= 5; j++){
                    for(int k = 0; k < j; k++){
                        if(thisWeekNumber[i][j] == thisWeekNumber[i][k]){
                            counter++;
                        }
                    }
                }
                if(counter == 0){
                    break;
                }
            }
        }
    }
}

