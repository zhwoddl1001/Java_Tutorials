package com.kh.practice.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaFinalPre {
    //1. 배열과 반복문
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) { // 홀수인지 확인
                sum += number; // 홀수일 경우 합산
            }
        }
        return sum;
    }

    //2. 컬렉션과 조건문
    public void print() {
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Andrew");
    names.add("Eve");
    System.out.println("A 로 시작하는 이름 : ");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }

    }
    //3. 예외 처리
    public void Division(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.print("첫번째 정수를 입력하세요 : ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("결과 : " +result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    //4.상속
}
