package com.kh.polymorphismEx;

/*
* 다형성 : 다양한 형태를 지니는 성질
* 
* 1. 상속 관계의 자식 객체의 모습이 여러 모습으로 보임
*    자식 객체, 부모 객체, Object 객체 등으로 변하는 것처럼 보임
* 
* 2. 오버 로딩
*       같은 클래스에서 같은 이름의 메서드를 여러 번 작성하는 기술
*       조건 : 메서드명 동일, 매개변수 개수, 타입 순서하나라도 달라야함
*       목적 : 전달 받은 매개 변수에 따른 상황별 처리 방법 구현
*   sum(a,b) - 두 수 더하기
*   sum(a,b,c) - 세 수 더하기
*   sum(배열)  - 배열 내 요소 모두 더하기
* */
public class PolymorphismEx {
    // 오버로딩문제
    // public void sum 명칭 변경 X
    // 하나는 두 수끼리 더하기
    // 하나는 세 수끼리 더하기
    // 하나는 두 실수끼리 더하기
    // 하나는 문자형끼리 더하기
    /*
    public void sum1(int a, int b) {
        System.out.println(a + b);
    };
    public void sum2(int a, int b, int c) {
        System.out.println(a + b + c);
    };
    public void sum3(double a, double b){
        System.out.println(a + b);
    };
    public void sum4(String a, String b){
        System.out.println(a + b);
    };
    */
    /*
    기준    public void method1(int i){}
            =========================
 1  O  public void method1(String str){}             // 기준과 자료형이 다르기 때문에 가능
 2  O  public void method1(int i, String str){}      // 기준과 다른 자료형이 들어가 있기때문에 가능
 3  X  public void method1(int num){}                // 기준과 같은 자료형이기 때문에 불가능
 4  X  public char method1(int point){}              // 기준과 같은 자료형이기 때문에 불가능
 5  O  public void method1(int i, int k){}           // 기준과 매개 변수 갯수가 다르기 떼문에 가능
 6  X  public void method1(int num, String string){} // 기준과 다르지만 2번에 이미 같은 자료형과 갯수가 있으므로 불가능
 7  O  public void method1(String str, int i){}      // 기준과 다르고 매개변수 순서가 다르기 때문에 가능

     */
}
