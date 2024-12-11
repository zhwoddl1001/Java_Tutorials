package com.kh.practiceEX.filrPre;

import java.security.Provider;

public class FileServiceRun {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        
        
        //파일에 작성할 내용
        /*
         맛있는 음숙 목록 : 줄바꿈 - 피자 줄바꿈 - 치킨 줄바꿈 -초밥 줄바꿈 -파스타
         createFile 기능 호출 자료형 없는 매개변수명으로 파일작성내용 넣어주기
        * */
        String input = "\n 피자 \n 치킨 \n 초밥 \n 파스타";
        fileService.createFile(input);
        fileService.readFile();
        String content = "\n햄버거 \n돈까스 \n쌀국수 \n카레";
        fileService.appendToFile(content);
    }
}
