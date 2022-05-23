import java.util.Scanner;
//    백엔드 2기 김다현
public class JavaStudy08 {
    public static void main(String args[]) {
        TaxCalculator taxcal = new TaxCalculator();
        taxcal.run();
    }
}

class TaxCalculator
{
    private long annualIncome, tax_taxRate, progressiveDeduction;
    private long temp;
    private String percent = "%";
    private long[] criteria = {
            0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000
    };
    private long[] tax = {
            6, 15, 24, 35, 38, 40, 42, 45
    };
    private long[] pd = {
            0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000
    };
    Scanner scan = new Scanner(System.in);

    public void run() {
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.: ");
        annualIncome = scan.nextLong();
        PDcalculator();
        calculator();
        System.out.printf("세율에 의한 세금 : %d\n", tax_taxRate);
        System.out.printf("누진공제 계산에 의한 세금 : %d\n", progressiveDeduction);
    }
    private void calculator() {
        temp = annualIncome;
        for(int i = 0; i <= 7; i++){
            if(temp > 0){
                if(annualIncome >= criteria[i]){
                    if(annualIncome <= criteria[i+1] || i == 7){
                        tax_taxRate += (annualIncome - criteria[i]) * tax[i] / 100;
                        System.out.printf("%d * %d%s = %d\n\n", (annualIncome - criteria[i]),
                                tax[i],percent, ((annualIncome - criteria[i]) * tax[i] / 100));
                        break;
                    }else{
                        tax_taxRate += (criteria[i+1] - criteria[i]) * tax[i] / 100;
                        temp -= (criteria[i+1] - criteria[i]);
                        System.out.printf("%d * %d%s = %d\n", (criteria[i+1] - criteria[i]),
                                tax[i], percent, ((criteria[i+1] - criteria[i]) * tax[i] / 100));
                    }
                }
            } else{
                break;
            }
        }
    }
    private void PDcalculator() {
        for(int i = 0; i <= 7 ; i++){
            if(annualIncome > criteria[7-i]){
                progressiveDeduction = ((annualIncome * tax[7-i] / 100) - pd[7-i]);
                break;
            }
        }
    }
}