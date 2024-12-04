package com.kh.practice.todolist;

public class JavaFinalPreRun {
    public static void main(String[] args) {

      //1배열과 반복문
        int[] numbers = {1, 2, 3, 4, 5};
        JavaFinalPre javaFinalPre = new JavaFinalPre();
        int result = javaFinalPre.add(numbers);
        System.out.println("홀수 값의 합: " + result);

       //2 컬렉션과 조건문
       javaFinalPre.print();


    }
}
