package com.kh.testEx.test3Pre;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentManager {
    public static void main(String[] args) {
        Set<String> studentSet = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("===[1] 학생 추가 ===");
                    System.out.print("추가할 학생이름을 입력하세요 : ");
                    String studentName = sc.nextLine();
                    if (!studentSet.contains(studentName)) {
                        studentSet.add(studentName);
                    } else {
                        System.out.println(studentName + " 은 이미 존재하는 학생입니다.");
                    }
                    break;
                case 2:
                    System.out.println("===[2] 학생 삭제 ===");
                    System.out.print("삭제할 학생이름을 입력하세요 : ");
                    String nameToremove = sc.nextLine();
                    if (studentSet.remove(nameToremove)) {
                        System.out.println(nameToremove + "이 삭제되었습니다.");
                    } else {
                        System.out.println("존재하지 않는 학생이빈다.");
                    }
                case 3:
                    System.out.println("===[3] 학생 목록 ===");
                    if (studentSet.isEmpty()) {
                        System.out.println("학생목록이 비어있습니다.");
                    } else {
                        for (String name : studentSet) {
                            System.out.println(name);
                        }
                    }
                    break;
                case 4:
                    System.out.println("===[4] 학생 조회 ===");
                    System.out.println("학생이름을 입력해주세요 : ");
                    String nameToCheck = sc.nextLine();
                    if (studentSet.contains(nameToCheck)) {
                        System.out.println(nameToCheck + " 은 존재하는 학생입니다.");
                    } else {
                        System.out.println(nameToCheck + "은 학생목록에 존재하지 않습니다.");
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 입력입니ㄷ. 다시 시도하세요.");
                    break;

            }
        }
    }

}
