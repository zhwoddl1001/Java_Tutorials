package com.kh.practiceEx.arraypre;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPre {

    public void int1DArray(){
        int[] arr1 = {10,300,20,50,7000,9999};
        int[] arr2 = {10,300,20,50,7000,9999};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        System.out.println("arr1 을 오름차순으로 배열 했는지 : "+Arrays.toString(arr1));

        Arrays.fill(arr1,500);
        System.out.println("arr1의 값을 500으로 다 채웠는지 : "+Arrays.toString(arr1));

        boolean a = Arrays.equals(arr1,arr2);
        System.out.println("arr1과 arr2가 같은 값인지 비교 : "+a);
    }
    public void string1DArray(){
        String[] arr1 ={"apple","banana","cherry","date","elderberry"};
        String[] arr2 ={"apple","banana","cherry","date","elderberry"};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        System.out.println("arr1 을 오름차순으로 배열 했는지 :"+Arrays.toString(arr1));

        Arrays.fill(arr1,"mango");
        System.out.println("arr1의 값을 mango 로 다 채웠는지 : "+Arrays.toString(arr1));

        boolean a =Arrays.equals(arr1,arr2);
        System.out.println("arr1과 arr2가 같은 값인지 비교 : "+a);
    }



    public static void main(String[] args) {
        ArraysPre arraysPre = new ArraysPre();
        arraysPre.int1DArray();
        arraysPre.string1DArray();
    }
}
