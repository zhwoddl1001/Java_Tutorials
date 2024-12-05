package com.kh.practiceEx.arraypre;

import java.util.Arrays;
/*
1차원 배열
int[] arr ={숫자값 직접 넣기};
int []arr =new int{몇 개의 숫자가 들어갈지 숫자 들어갈 칸 자릿수};
int arr[];

2차원 배열
[첫 번째 시작하는 {} 배열 갯수] [{{배열 안에 몇 개의 값을 배치할지 설정}}]
int[][] arr ={   {    }  , {    }  ,  {    }    };
int [][]arr =new int{[세로칸] [가로칸]};
int arr[][];
* */

public class ArrayPre {
    //1.주어진 정수 배열에서 가장 큰 숫자를 찾아서 출력하기
    public void maxValue(){
       //정수가 들어있는 배열
        int[] numbers = {12,45,3,22,78,10};

        //배열에사 최대값을 찾아 출력
        int max = numbers[0]; // 찾은 최대값을 가져올 변수명 설정 int 이기 때문에 최초숫자는 0
        /*
        * for(int i=1 0이 아니라 1로 시작하는 이유
        * int max = numbers[0]; 에서 number[0] 0번 째 자리에 최대값을 저장한다 설정했기 때문
        * 첫 번째 자리값은 이미 최대값 후보로 선정
        * 첫 번째 자리값과 두 번째 자리값이 비교를 진행해서
        * 두 번째 자ㅣ값이 첫 번째 자리값보다 크다면 두 번째 자리값을 첫 번째 자리값에 넣어줌
        * */
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){//만약에 비교할 숫자가 max에 들어있는 최대값보다 크다면
                max = numbers[i]; // 최대값을 현재 비교하고 있는 숫자로 교체하기
            }
        }// for문은 결과를 찾기 위한 과정이기 때문에 for문이 종료된 다음에 결과를 출력
        System.out.println("최대값 : "+ max);
    }

    //2.문자열 배열에서 특정 문자열 찾기 cherry 라는 단어가 어디에 위치했는지 찾아보기
    public void findString(){
        String[] words = {"apple","banana","cherry","melon"};
        String target = "cherry";

        //TODO : 특정 문자의 위치를 찾고 출력하는 for문 완성
      /*  for(String word:words){ // 위치에 관계없이 단어 찾는 for문
            if(word.equals(target)){
                System.out.println(word);
            }
        }
        */

        for(int i=0;i<words.length;i++){ // 특정 위치 찾기 for문
            if(words[i].equals(target)){
                System.out.println("찾는 문자열 ["+target+"] 은 배열의" + i + "번째 위치에 있습니다.");
                break;
            }
        }
    }

    //3. 배열에서 특정 숫자 교체하기
    public void replaceArrayNumber(){
        //입력 배열
        int[] numbers = {10,20,30,40,20,320};
        int target = 20; // 교체할 숫자
        int replaceNumber = 99; //20대신 넣을 숫자

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                numbers[i]=replaceNumber;

            }
        }
        System.out.println("교체된 후 배열 번호 : ");
        for(int num:numbers){
            System.out.print(num+" "); // 교체된 결과 출력
        }
        System.out.println();
        //for 문으로 배열을 순회해서 만약에 교체할 숫자랑 배열에 들어있는 숫자가 일치하다면 99로 교체
    }

    //4. 배열에서 특정 문자열 교체하기
    public void replaceArrayString(){
        String[] words = {"apple","banana","cherry","banana","date"};
        String target = "banana";
        String replacement = "mango";
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                words[i]=replacement;
            }
        }
        System.out.println("배열에서 banana 를 mango 로 교체한 결과");
        for(String word:words){
            System.out.print(word+" ");
        }
        System.out.println();
    }

    //5. 이중 배열 값 출력하기
    public void print2DArray(){
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");
                // i 0번부터 j = 0,1,2 자리를 순차적으로 순회한 다음
                // i 2번자리까지 모두 순회한 결과 표기
            }
        }
        System.out.println(); // 모두 출력한다음 줄바꿈 처리
    }

    //TODO : 6.특정 숫자값의 위치찾기
    public void find2DArray(){
        int[][] numbers = {{10,20,30},{40,50,60},{70,80,90}};
        int target = 50;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == target) {
                    System.out.println("숫자 "+target+" 은 " +i+","+j+"위치에 존재합니다."+numbers[i][j]);
                    break;
                }
            }
        }

    }
    //7. 특정 문자열 위치 찾기
    public void findStringIn2DArray(){
        String[][] words = {{"cat","dog","fish"},{"parrot","hamster","rabbit"},{"turtle","snake","lizard"}};
        String target = "rabbit";
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length;j++){
                if(words[i][j] == target){
                    System.out.println("단어 "+target+" 은 " +i+","+j+"위치에 존재합니다."+words[i][j]);
                }
            }
        }
    }
        //8. 특정 문자열 교체하기
    public void replaceStringIn2DArray(){
        String[][] words = {{"red","blue","green"},{"yellow","blue","purple"},{"pink","blue","orange"}};
        String target = "blue";
        String replacement = "cyan";

        // 문자열 target -> replacement 로 교체
        for(int i=0;i<words.length;i++){ // 값을 꺼내기 1단계
            for(int j=0;j<words[i].length;j++){ // 1단계에서 찾을 값을 꺼내기
            if(words[i][j].equals(target)){ // 만약에 target과 replacement를 비교했을 때 일치하면
                words[i][j]=replacement; // blue가 존재하는 위치에 cyan 넣어주기
             }
                //System.out.print(words[i][j] +"");
            }
        }
        System.out.println("blue -> cyan 변경 완료");
        //결과 배열 출력

         System.out.println(Arrays.toString(words)); //-> Arrays 객체
        //[[Ljava.lang.String;@4fca772d, [Ljava.lang.String;@9807454, [Ljava.lang.String;@3d494fbf]

        System.out.println(Arrays.deepToString(words));
        //[[red, cyan, green], [yellow, cyan, purple], [pink, cyan, orange]]

        for(int i=0;i<words.length;i++){ // {   맨 처음에 감싼 배열 순회    }
            for(int j=0;j<words[i].length;j++){// {   {두 번째로 감싸져 있는 배열 순회} }
                System.out.print(words[i][j]+" ");// 세로 0번째 부터 가로 0,1,2 순회 해서 세로 2번째까지 모두 순회
            }
            System.out.println(); // 각 행 출력 후 줄바꿈
        }
    }

    // 문자열 toString으로 출력하기
    public void lunchMenuArray(){
        String[] lunchMenu = {"김치찌개","된장찌개","삼겹살","초밥","치킨","햄버거"};
        System.out.println(Arrays.toString(lunchMenu));
    }
    //이중 문자열 deepToString 으로 출력하기
    public void lunchMenu2DArray(){
        String[][] lunchMenu ={{"김치찌개","된장찌개","불고기"},{"햄버거","피자","파스타"},{"짜장면","짬뽕","탕수육"},{"초밥","라멘","돈카츠"}};
        // toString 은 1차원 배열만 값을 출력하므로
        // 각 배열 내에 행 주소 값 출력
        System.out.println(Arrays.toString(lunchMenu));

        //deepToString 은 2차원 이상의 배열 내 존재하는 값을 출력
        System.out.println(Arrays.deepToString(lunchMenu));
    }

    // 메인 메서드
    public static void main(String[] args) {
        ArrayPre arrayPre = new ArrayPre(); //ArrayPRe 내부에 있는 기분을 사용
        //arrayPre.maxValue();
        //arrayPre.findString();
        //arrayPre.replaceArrayNumber();
        //arrayPre.replaceArrayString();
        //arrayPre.print2DArray();
        //arrayPre.find2DArray();
        //arrayPre.findStringIn2DArray();
        //arrayPre.replaceStringIn2DArray();
        arrayPre.lunchMenuArray();
        arrayPre.lunchMenu2DArray();
    }
}
