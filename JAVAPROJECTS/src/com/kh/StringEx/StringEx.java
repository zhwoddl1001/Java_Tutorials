package com.kh.StringEx;

public class StringEx {
    /*
     * String 에 적혀있는 대표적인 기능들
     *
     *String str = "안녕하세요";
     *
     * str.length() = 문자열의 길이를 반환
     * str.chatAt(int index)                       = 특정 숫자위치의 문자를 반환
     * str.indexOf(String str)                     = 특정 문자열의 첫 번째 위치를 반환 (못 찾으면 -1)
     * str.lastIndexOf(String str)                 = 특정 문자열의 마지막 위치를 반환
     * str.contains(String str)                    = 문자열에 특정 값이 포함되어 있는지 true false로 확인
     * str.equals(String str)                      = 문자열이 같은지 비교 (대소문자구분)
     * str.equalsIgnoreCase(String str)            = 문자열이 같은지 비교 (대소문자구분 X)
     * str.toUpperCase()                           = 문자열을 모두 대문자로 변환
     * str.toLowerCase()                           = 문자열을 모두 소문자로 변환
     * str.trim()                                  = 문자열의 앞뒤 공백 제거
     * str.subString(int beginIndex)               = 특정 위치부터 끝까지 자르기
     * str.subString(int beginIndex,int endIndex)  = 특정 범위를 자르기
     * str.replace(target,replaceMent)             = 특정(target)문자를 다른 문자로 대체
     * str.replaceAll(String regex,replaceMent)    = 정규식을 이용해서 치환
     * str.split(String regex)                     = 문자열을 정규식 기준으로 나누기
     * str.concat(String str)                      = 문자열을 결합
     * str.join(구분자, 결합1, 결합2, 결합3,...)      = 구분자를 이용해 문자열 결합
     * str.isEmpty()                               = 문자열이 비어있는지 확인 true false
     * str.isBlank()                               = 공백란 포함하거나 비어있는지 확인 true false
     * */
    public static void main(String[] args) {
        StringEx se = new StringEx();
        se.methodString();
    }

    public void methodString(){
        String str1 = "  Hello World  ";
        String str2 = "hello";

        //1. str1 문자열의 길이 반환
        System.out.println("str1 문자열 길이 : " +str1.length());

        //2. str2 1번 위치의 문자가 무엇인지 확인
        System.out.println("str2 1번 위치의 문자열" + str2.charAt(1));
        
        //3. str2 첫 번째 위치 반환 대상자는 영어알파벳 l
        System.out.println("str2 에서 l의 첫번째 위치는 : " + str2.indexOf("l"));

        //4. str2 마지막 위치 반환 대상자는 영어알파벳 l
        System.out.println("str2 에서 l의 마지막 위치는 : " + str2.lastIndexOf("l"));

        //5.str1 World 라는 값이 포함되어 있는지 확인 결과 : boolean
        boolean contains = str1.contains("World");
        System.out.println(str1.concat("st1 에 World 가 포함 되어 있는가" + contains));

        //6. 문자열 비교 대소문자 구분 str1 과 str2 비교
        System.out.println("문자열 비교 대소문자 구분"+ str1.equals(str2));

        //7. 문자열 비교 대소문자 구분X hello world! 비교
        System.out.println("hello world!와 문자열 비교 대소문자 구분 x : "+str1.equalsIgnoreCase("Hello World"));

        //7-1. 문자열 비교 대소문자 구분X hello world!와 공백 제거후 비교
        System.out.println("hello world!와 문자열 비교 대소문자 구분 x : "+str1.trim().equalsIgnoreCase("Hello World"));

        //8. str1 문자열을 모두 대분자로 변환
        System.out.println("str1 문자열을 모두 대문자로 변환 : "+str1.toUpperCase());

        //9. str2 문자열 모두 소문자로 변환
        System.out.println("str2 문자열을 모두 소문자로 변환 : "+str2.toLowerCase());

        //10. str 앞 뒤 공백 제거
        System.out.println("str1 앞 뒤 공백제거 : " + str1.trim());

        String str3 = "Hello Java World";
        // 11. subString 이용해서 str3 6번째부터 끝까지 자르기
        System.out.println("6번째 부터 끝까지 자르기 : " + str3.substring(6));
        // 12. subString 이용해서 str3 3~7 까지만 자르기
        System.out.println("3~7번째 까지 자르기 : " + str3.substring(3,7));
        // 13. Java 를 HTML 로 대체 replace 이용
        System.out.println("Java를 HTML로 대체 : " + str3.replace("Java","HTML"));
        // 14. concat 이용 해서 str4 를 str3 와 결합 str3 +str4
        String str4 = "Let`s learn";
        System.out.println("str3 와 str4 결합 : " + str3.concat(str4));

        // 15. split 문자열을 "" 기준으로 나누고 향상된 for-each 문을 이용해서 출력
        // split 는 배열 형식
        String[] splitArray = str3.split("");
        System.out.println("str3를 공백으로 나눈 결과 출력");
        for(String str : splitArray){
            System.out.println(str);
        }
    }
    public void  method1(){
        String str ="안녕하세요. 반갑습니다.";
        System.out.println(str);
        str = "식사는 맛있게 하셨나요?";
        System.out.println(str);
    }
    public void method2(){
        String str = "Hello"; //1번 Hello 가 들어있는 영역
        str += "World";       // 2번 HelloWorld 가 들어있는 영역
        System.out.println(str); // HelloWorld
    }
}
