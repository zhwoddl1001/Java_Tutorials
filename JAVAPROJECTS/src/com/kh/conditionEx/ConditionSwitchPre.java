package com.kh.conditionEx;

public class ConditionSwitchPre {
    /*
     *  사용자가 입력한 숫자에 따라 해당 숫자가 어떤 요일인지 출력하는 프로그램
     *  1부터 7까지의 숫자를 입력받아 switch 문을 사용해 요일 출력
     *
     * 1: 월 2 화 3 수 4 목 5금 6 토 7 일
     * */
    public void choiceDay(int choice) {
        switch (choice) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("잘못 입력 하셨습니다.");
                break;
                /*default break 밑으로 기능 구문 작성 X */
        }
    }
}
