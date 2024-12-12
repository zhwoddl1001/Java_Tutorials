package com.kh.practiceEX.StringEx;

public class StringBuilderPre {
    /*TODO
       String str = "Welcom";
      1. 작성된 객체를 StringBuilder sb로 변환해서 사용
      2. to Java 이어서 작성
      3. 8번째 자리에 the world of 글자 추가
      4. 4~11 come to 변경
      5. 20~25 삭제
      6. sb 뒤집기
    * */
    public void stringBuilder(){
        String str = "Welcome";
        //1.
        StringBuilder sb = new StringBuilder(str);

        //2.
        sb.append("to Java");
        System.out.println("to Java 삽입 : "+sb);

        //3.
        sb.insert(8,"the world of");
        System.out.println("8번째에 the world of 삽입 : "+sb);

        //4.
        sb.replace(4,11,"come to");
        System.out.println("4~11번째 come to로 교체 : " + sb);

        //5.
        sb.delete(20,25);
        System.out.println("20~25 번째 글자 삭제 : "+sb);

        //6.
        sb.reverse();
        System.out.println("글자 뒤집기 : " +sb);

    }
    public static void main(String[] args) {
        StringBuilderPre sb = new StringBuilderPre();
        sb.stringBuilder();
    }
}
