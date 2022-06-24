package Practice.Java04;

// Java 프로그래밍 - 조건문

public class Main {
    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");
        int waterTemperature = 100;

        if (waterTemperature >= 100) {
            System.out.println("물이 끓습니다.");
        } else {
            System.out.println("물을 끓이는 중입니다");
        }

        int score = 90;
        char grade = 0;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);


//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "apple";

        switch (fruit) {
            case "apple":
                System.out.println(fruit + "은 + 5000원입니다");
                break;
            case "mango":
                System.out.println(fruit + "은 + 10000원입니다");
                break;
            default:
                System.out.println("해당 과일이 없습니다");
                break;
        }



//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int number = 5;
        if (number % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }



//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
        int sco = 90;
        char gra = 0;

        switch (sco/10){
            case 9:{
                System.out.println(gra = 'A');
                break;
            }
            case 8:{
                System.out.println(gra = 'B');
                break;
            }
            case 7:{
                System.out.println(gra = 'C');
                break;
            }
            default :{
                System.out.println(gra = 'F');
            }
        }
        System.out.println("Grade = " + gra);
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);


    }
}