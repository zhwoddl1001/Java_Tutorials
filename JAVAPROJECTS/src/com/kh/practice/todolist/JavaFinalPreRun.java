package com.kh.practice.todolist;

public class JavaFinalPreRun {
    public static void main(String[] args) {

      //1배열과 반복문

        JavaFinalPre javaFinalPre = new JavaFinalPre();
        System.out.println("===홀수 더하기 기능===");
        javaFinalPre.addSum();


       //2 컬렉션과 조건문
        System.out.println("===첫 글자 A로 시작하는 단어 찾기===");
       javaFinalPre.print();

        //3. 예외 처리
        System.out.println("\n===나눗셈 결과 출력===");
        javaFinalPre.Division();

        //5.
        System.out.println("===파일 안에 있는 숫자 더하고 더한 숫자 저장하기===");
        javaFinalPre.fileSum();

        //7.계산기 실행하기
        System.out.println("===계산기 실행하기===");
        javaFinalPre.arithmeticOperation();

    }
}
