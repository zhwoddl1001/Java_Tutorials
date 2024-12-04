package com.kh.practice.todolist;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaFinalPre {
    //1. 배열과 반복문
    public void addSum(){
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] % 2 != 0){
                sum += numbers[i];
            }
        }
        System.out.println("홀수의 합 : " + sum);
    }

    //2. 컬렉션과 조건문
    public void print() {
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Andrew");
    names.add("Eve");
    /*
    String 참조 자료형에 들어있는 기능
        맨 앞에 변수명으로는 boolean 을 쓸 수 있음
    startsWith(String prefix) = prefix로 시작하는 글자가 있는지 확인
     예제 ) boolean startWord = String으로들어있는변수명.startsWith("시작하는단어글자")

    endWith(String suffix) = suffix로 끝나는 글자가 있는지 확인
    예제 ) boolean endWord = String으로들어있는변수명.endWith("시작하는단어글자")


            predix = 시작하는(접두사)
            suffix = 끝나는(접미사)
    * */
    System.out.println("A로 시작하는 이름 : ");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }

    }

    //3.예외 처리
    public void Division(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.print("첫번째 정수를 입력하세요 : ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("결과 : " +result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    //5.
    public void fileSum() {
        String path = System.getProperty("user.home") + "/Desktop/";
        String readFile = "numbers.txt";
        int sum = 0;

        //파일 쓰기 = File FileWriter    파일 읽기 = FileReader BufferedReader
        //File 은 try catch 안에 들어있지 않음
        // FileWriter  FileReader BufferedReader 는 try 내부에 있어야함 try{} try()
        try (FileReader file = new FileReader(path +readFile);
                BufferedReader br = new BufferedReader(file)) {


            String line;
           while ((line = br.readLine()) != null) {
               //window 컴퓨터의 경우 뒤에 숨겨진 공백이 존재하기 때문에
               //trim() 양쪽 공백 제거를 이용해서 한 번 제거를 진행해야함
               // 우리 눈에는 공백이지만 \r 과 같이은 공백이 포함되어있음 \r 왼쪽 끝으로 키보드 커서를 이동
               sum += Integer.parseInt(line.trim());
           }
        }catch (Exception e){
         System.out.println("예상치 못한 문제로 파일을 읽을 수 없습니다." + e.getMessage());

        }
        // 위는 number.txt 내부에 들어있는 숫자들을 모두 더하는 기능
        
        // 아래는 모두 더해진 result.txt 작성하는 기능

        try(FileWriter writer = new FileWriter(path + "results.txt");) {
            writer.write("Sum : " + sum);
            System.out.println("더한 결과 작성 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //7. 연산자와 변수
    public void arithmeticOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("합 : " + (a+b));
        System.out.println("차 : " + (a-b));
        System.out.println("곱 : " + (a*b));
        try {
            System.out.println("몫 : " + (a/b)); // b의 값이 0이 오면 0으로 숫자를 나눌 수 없습니다 예외 발생
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("나머지 : " + (a%b));
    }
}
