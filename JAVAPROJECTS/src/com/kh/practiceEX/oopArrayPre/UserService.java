package com.kh.practiceEX.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public void setSaveAllUser(){
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.println("사용자를 등록합니다.");




        //username 빈칸이거나 6글자 이상 저장 x return 시키기
        System.out.println("이름을 입력하세요(2자이상 5자 이하 작성가능) : ");
        String inputName = sc.nextLine();
        if(inputName != null && inputName.length() < 6 && inputName.length() > 2) {
            u.setUserName(inputName);
            System.out.println("이름이 성공적으로 입력되었습니다" + inputName);
        }else {
            System.out.println("이름은 빈칸이거나 1글자 미만 6글자 이상 작성할 수 없습니다.");
            return;
        }


      //  int inputAge = 10;
        int inputAge = sc.nextInt();
        sc.nextLine();

        try {
            if (inputAge > 0 && inputAge < 100) {
                u.setAge(inputAge);
                System.out.println("[" + u.getAge() + "]저장되었습니다.");
            } else {
                System.out.println("저장하지 못했습니다.");
                return;
            }
        }catch (Exception e) {
            System.out.println("나이는 숫자만 입력 가능합니다.");
        }



        //email 빈칸이거나 30자 이상 작성 불가 return 시키기
        System.out.println("이메일을 작성해 주세요 : ");
        String inputEmail = sc.nextLine();
        if(inputEmail != null && inputEmail.length() < 30 && inputEmail.length() >= 8) {
            u.setEmail(inputEmail);
            System.out.println("이메일이 성공적으로 입력되었습니다" + inputEmail);
        }else {
            System.out.println("저장되지 않았습니다");
            return;
        }

      //  u.setUserName("홍길동");       // String 변수명 = u.setUserNAme 형식으로 변수명에 저장 불가
     //   u.setAge(10);                // int 변수명 = u.setAge 형식으로 변수명에 저장 불가
       // u.setEmail("hong@hong.com"); // String 변수명 = u.setEmail 형식으로 변수명에 저장 불가
        //set 으로 저장된 값은 변수명에 넣어주는 것이 아니라 get 으로 정보 반환할 수 있음

        System.out.println("-----------저장된 사용자 정보 ----------");
        // ArrayList 이용해서 정보 저장하고
        ArrayList<User> a = new ArrayList<>();
        a.add(u);
        // toString 을 이용해서 저장된 사용자 정보 가져오기
        System.out.println(a.toString());


    }

    //매개변수 생성자 통해서 저장 나이는 필수가 아님
    //매개변수 생성자 - > 이름 /ㅇ이메일만 필수로 받도록 수정

    //이메일을 입력하시겠습니까> yes / no 대소문자 구분없이 받기 equls
    // yes 했다면 setEmail 을 통해 입력 받은 이메일 저장

    public void paramNameEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String inputName = sc.nextLine();
        System.out.println("이메일을 입력하세요 : ");
        String inputEmail = sc.nextLine();
        User u = new User(inputName, inputEmail);
        System.out.println("나이를 입력하시겠습니까?");
        String q = sc.nextLine();

        if(q.equalsIgnoreCase("yes")){
            System.out.println("나이를 입력하세요 : ");
        int inputAge = sc.nextInt();
        sc.nextLine();
            if (inputAge > 0 && inputAge < 100) {
                u.setAge(inputAge);
                System.out.println("[" + u.getAge() + "]저장되었습니다.");
            } else { // 0세 이거나 100세 이상일 경우 나이저장 불가능하게 설정
                System.out.println("나이는 1세이상 100세 미만만 작성 가능합니다.");
                return; // 돌려보내기
            }
        }else if(q.equalsIgnoreCase("no")){ // 나이입력 안한다 했을 경우
            System.out.println("나이는 추후 개인정보에서 재설정 가능합니다.");
        }else{// yes no 이외 다른 글자를 입력했을 때
            System.out.println("잘못 입력하였습니다");
        }





        System.out.println(u.toString());
    }
}
