package com.kh.practice.todolist;

import java.util.ArrayList;

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
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }

    }

}
