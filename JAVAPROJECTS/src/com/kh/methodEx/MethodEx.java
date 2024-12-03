package com.kh.methodEx;
/*
 * 접근 제한자 static 전달 유무 기능명칭(매개변수명){
 *       특정기능이나 반환 값 작성
 *
 * }
 *
 * 대표 메서드 종류
 * (생성자(기본/매개변수) getter/setter toString main() void return
 *
 * 전달(반환)할 것이 없을 때 = void
 * public void 메서드명(매개변수명){
 * System.out.println(기능이 실행되었습니다.)
 *
 * if(기능에 문제가 있을 경우){
 *     System.out.println("기능에 문제가 생겼습니다. 종료합니다.)
 *       return; // 특정 기능을 종료시킬 때 사용
 *
 *   }
 *
 * }
 * 전달(반환) 할 것이 있을 때 = return
 * public 자료형 메서드명(매개변수명){
 *       return 자료형에 알맞는 값;
 * }
 * */
public class MethodEx {
    //특정 행동이나 기능을 작성하는 공간

    private String name;

    //get이나 set과 같은 MethodEx 에 있는 속성이나 기능을 사용할 때 사용을 나타내기 위한 생성자 메서드
    public MethodEx() {
    }

    public MethodEx(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MethodEx{" +
                "name='" + name + '\'' +
                '}';
    }

    //main 최종적으로 기능을 수행할 때 사용하는 메서드
    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx();
        methodEx.toString();
    }
}
