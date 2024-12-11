package com.kh.testEx.test3Pre;

import java.util.HashMap;

public class StudentScoreManager {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap <String, Integer>();
        student.put("김철수", 85);
        student.put("이영희", 92);
        student.put("박민수", 77);
        student.put("최수진", 88);
        System.out.println("학생 정보 출력");
        
        for(HashMap.Entry<String,Integer> entry : student.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // System.out.println(student); 를 새로로 만들어줌


      for(String name : student.keySet()) {
          Integer score = student.get(name);
          if(score > 80) {
              System.out.println(name + " : 합격");
          }else {
              System.out.println(name + " : 불합격");
          }
      }

      System.out.println("=======박민수 점수 변경 ===========");
      student.replace("박민수",82);

      System.out.println(student);
        try {
            for(String name : student.keySet()) {
                Integer score = student.get(name);
                if(score > 80) {
                    System.out.println(name + " : 합격");
                }else {
                    System.out.println(name + " : 불합격");
                }
            }
        } catch (Exception e) {
            System.out.println("존재하지 않는 학생입니다" + e.getMessage());
        }
    }
    // 점수 출력 기능 메서드


}
