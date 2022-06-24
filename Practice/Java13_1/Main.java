package Practice.Java13_1;

// Java 프로그래밍 - 입출력_1

import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
        System.out.print("입력 :");
        int a = System.in.read() - '0';
        //System.in.read는 Character값 하나를 받아올 수 있는데
        // 숫자값을 받아오면 문자라서 아스키코드값에 맵핑이 되어있는데 그 아스키 코드값만큼 빼서
        // 숫자로 변환해 주는 부분
        System.out.println("a = " + a);
        // 데이터를 넣고 엔터를 누르면 엔터값포함 데이터를 읽어옴
        // 하지만 System.in.read는 값을 하나만 가져오기때문에
        // 뒤에 엔터키가 남음
        System.in.read(new byte[System.in.available()]);
        // 이부분을 통해 엔터키를 소진해줌


//      InputStreamReader
        System.out.println("== InputStreamReader ==");
        InputStreamReader reader = new InputStreamReader(System.in);
        // 매개변수로 System.in을 넣어줘야함
        char[] c = new char[3];
        // 하나의 문자가아니라 여러개의 데이터를 받아올 수 있음
        System.out.print("입력 : ");
        reader.read(c);
        System.out.println(c);

//      BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력");
        String s1 = br.readLine();
        System.out.println("s1 =" + s1);
    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
//        referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner sc = new Scanner(System.in);
//        System.out.print("입력 = ");
//        System.out.println(sc.next());
//        sc.nextLine(); // 엔터키 소진을 위함

//        System.out.print("입력2 :");
//        System.out.println(sc.nextInt());
//        sc.nextLine();

        System.out.print("입력 3 :");
        System.out.println(sc.nextLine());

//      참고) 정수, 문자열 변환
        int num = Integer.parseInt("12345");
        String str = Integer.toString(12345);

//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("Hello");
        System.out.println("World!");

        System.out.print("Hello");
        System.out.print("World!");
        System.out.println();

        System.out.printf("Hello");
        System.out.printf("World!");
        System.out.println();

        String s = "자바";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다");
        System.out.printf("%s는 언어 선호도 %d위 입니다\n", s, number);

        System.out.printf("%d\n", 10); //정수
        System.out.printf("%o\n", 10); // 8진수
        System.out.printf("%x\n", 10); //16진수

        System.out.printf("%f\n", 5.2f); //실수형

        System.out.printf("%c\n", 'A'); // char
        System.out.printf("%s\n", "안녕하세요"); // String

        System.out.printf("%5d\n", 123); // 5개 공간확보 후 출력
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

        System.out.printf("%-5d\n", 123); // -는 왼쪽에 붙어서 출력
        System.out.printf("%-5d\n", 1234);
        System.out.printf("%-5d\n", 12345);

        System.out.printf("%.2f\n", 1.113221f); //소수점 자리수 .2 는 소수점2자리표현
    }
}
