package com.kh.operatorEx;

public class operatorPre {
    public static void main(String[] args) {

        System.out.println("-----전위 연산자 -----");
       // 계산이 먼저 진행된 다음 값을 사용
        int a = 5;
        System.out.println("a의 값 : " + a);
        
        // ++a == a+1 = a(+1이 완성된 a)
        // 5+1 로 6이 된 a를 result1에 넣어줌
        int result1 = ++a;
        System.out.println("a의 값 : " + a);
        System.out.println("result1의 값 : " + result1);


        System.out.println("-----후위 연산자 -----");
        // 연산이 나중에 수행 현재 값을 먼저 사용하고, 이후에 변수의 값이 증가 또는 감소
        int b = 5;
        System.out.println("b의 값 : " + b);
        int result2 = b++; // 우선은 result2 에 b=5 값을 넣어주고 , b+1을 진행
        System.out.println("b의 값 : " + b);
        System.out.println("result2의 값 : " + result2);


    }
}
