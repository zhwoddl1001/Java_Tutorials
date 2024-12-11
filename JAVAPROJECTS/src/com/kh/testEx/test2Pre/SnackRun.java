package com.kh.testEx.test2Pre;

import java.util.ArrayList;

public class SnackRun {
    public static void main(String[] args) {
        Snack s1 = new Snack("포테이토칩","짠맛",1500);
        Snack s2 = new Snack("초코파이","단맛",2000);
        Snack s3 = new Snack("허니버터칩","허니버터맛",2500);
        ArrayList<Snack> snack = new ArrayList<>();
        snack.add(s1);
        snack.add(s2);
        snack.add(s3);

        //Snack 출력
        for(Snack s: snack){
            System.out.println(s);
        }


    }
}
