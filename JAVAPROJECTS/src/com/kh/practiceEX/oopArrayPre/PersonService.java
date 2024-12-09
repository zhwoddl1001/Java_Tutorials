package com.kh.practiceEX.oopArrayPre;

import java.util.Scanner;

public class PersonService {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < people.length; i++) {
            System.out.println(i+"번째 사람의 이름을 입력하세요.");
            String name = sc.nextLine();

            System.out.println(i+"번째 사람의 나이를 입력하세요.");
            int age = sc.nextInt();
            sc.nextLine();

            people[i] = new Person(name,age);
        }
        System.out.println("\n 모든 사람이 등록되었습니다. 아래는 등록된 정보입니다");



         /*      people[0] = new Person("홍길동",20);
        people[1] = new Person("박길자",30);
        people[2] = new Person("오성순",40);
        people[3] = new Person("강하석",50);
*/

              System.out.println("===일반 for 문 ===");
        for ( int i = 0; i < people.length; i++ ) {
            System.out.println(people[i]);
        }

         /*   System.out.println("===향상된 for 문 ===");
        for (Person p : people) {
            System.out.println(p);
        }*/

    }
}
