package com.kh.loopEx;

import java.util.Scanner;

public class LoopRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ForEx forEx = new ForEx();
        //forEx.method1();
        //forEx.method2();

        WhileEx whileEx = new WhileEx();
        System.out.println("숫자를 입력해 주세요.");
        int number = sc.nextInt();
        sc.nextLine();
        whileEx.method1(number);
    }
}
