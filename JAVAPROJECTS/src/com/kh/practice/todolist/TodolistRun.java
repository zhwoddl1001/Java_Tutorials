package com.kh.practice.todolist;

import java.io.IOException;
import java.util.Scanner;

public class TodolistRun {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Todolist td = new Todolist();
        System.out.println("==== To-Do 리스트 관리 ====");
        System.out.println("1. 기존 파일 불러오기");
        System.out.println("2. 새로운 파일로 시작하기");
        System.out.print("옵션을 선택하세요: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                System.out.println("불러올 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                String FILE_NAME = sc.nextLine();
                td.createFile();
                break;
                case "2":
                    System.out.print("새로운 To-Do 리스트 이름을 입력하세요(확장자 제외): ");

        }
    }
}
