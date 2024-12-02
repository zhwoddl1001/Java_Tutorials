package com.kh.practice.todolist;

import java.io.File;
import java.io.IOException;

public class Todolist {
    private static String PATH = System.getProperty("user.home") + "/Desktop/";
    private static String FILE_NAME =  "todolist"; //기본 파일 이름
    private static String EXT_NAME =  ".txt"; // 기본 확장자명



    public void createFile() throws IOException {
        File file = new File(PATH + FILE_NAME + EXT_NAME);
        if (!file.exists()) {
            System.out.println("파일을 생성하였습니다.");
            file.createNewFile();
        }
    }

}
