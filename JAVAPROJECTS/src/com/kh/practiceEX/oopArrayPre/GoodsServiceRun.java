package com.kh.practiceEX.oopArrayPre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();
        Scanner scanner = new Scanner(System.in);


        //false가 될때까지 반복
        while (true) {
            System.out.println("\n===== 상품 설정 시스템 =====");
            System.out.println("1.상품추가하기");
            System.out.println("2.모든 상품 보기");
            System.out.println("3.원하는 상품 보기(상품번호로 조회)");
            System.out.println("4.상품 제거하기(상품번호로 제거)");
            System.out.println("5.종료하기");
            System.out.print("번호를 선택하세요 : ");



            try {
                int choice = scanner.nextInt(); // InputMismatchException
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("상품 번호를 입력하세요");
                        int goodsId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("추가할 상품의 이름을 입력하세요");
                        String goodsName = scanner.nextLine();
                        System.out.println("상품 가격을 입력하세요");
                        int goodsPrice = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("상품 수량을 입력하세요");
                        int goodsQuantity = scanner.nextInt();
                        scanner.nextLine();
                        goodsService.addGoods(goodsId, goodsName, goodsPrice, goodsQuantity);
                        // Goods goods = new Goods(goodsId, goodsName, goodsPrice, goodsQuantity)
                        //  goodsService.addGoods(goods) 이렇게 하면 GoodService에서 addGoods(Goods goods) 형식으로 바꿔야함
                        break;
                    case 2:
                        goodsService.displayAllGoods();
                        break;
                    case 3:
                        System.out.println("원하는 상품번호를 입력해주세요.");
                        int inputId = scanner.nextInt();
                        scanner.nextLine();
                        goodsService.getGoodsById(inputId);
                        break;
                    case 4:
                        System.out.println("제거하실 상품번호를 입력해주세요.");
                        int removeId = scanner.nextInt();
                        scanner.nextLine();
                        goodsService.removeGoods(removeId);
                        break;
                    case 5:
                        System.out.println("시스템 종료를 선택하셨습니다.");
                        return;
                    default:
                        System.out.println("잘못 입력했습니다. 숫자만 입력 가능합니다,");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("숫자 형식만 가능합니다." + e.getMessage());
                scanner.nextLine(); // 예외 발생 시 입력 버퍼에 남아있던 잘못된 값을 비우기
            }
            catch (Exception e) {
                System.out.println("문제가 발생했습니다." + e.getMessage());
            } finally { // 실행하는 반복문이 우선이기 때문에 동작 x
                System.out.println("프로그램을 종료합니다.");
            }
        }
    }
}
