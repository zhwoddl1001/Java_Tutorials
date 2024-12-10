package com.kh.practiceEX.oopArrayPre;

import java.util.ArrayList;

public class GoodsService {
    //상품들을 담을 목록 리스트
    private ArrayList<Goods> goodsList  = new ArrayList<>();

    /**  void addGoods(Goods goods) 상품 추가 기능(Goods 에 존재하는 번호 이름 수량 가격추가)
     *
     * @param goodsId,goodsName,goodsPrice,goodsQuantity (Goods 에 존재하는 번호 이름 수량 가격추가)
     */
    public void addGoods(int goodsId,String goodsName, int goodsPrice, int goodsQuantity) {
        Goods goods = new Goods(goodsId,goodsName,goodsPrice,goodsQuantity);
        goodsList.add(goods);
        System.out.println(goods.getName() + "상품이 추가 되었습니다.");
    }

    /** getGoodsByName(String name) 상품명으로 상품 조회
     * 
     * @param name 상품이름 값을 받아서 조회
     * @return Goods로 상품이름에 해당하는 상품이 존재하면 전달
     * Goods = 상품번호 상품이름 상품가격 상품수량
     */
     public Goods getGoodsByName(String name) {
        for (Goods goods : goodsList) {
            if (goods.getName().equalsIgnoreCase(name)) {
                return goods;
            }
        }
        System.out.println(name + "존재하는 상품이 없습니다.");
        return null;
     }
    
    
    /** Goods getGoodsById(int id) 상품 번호로 원하는 상품 가져오기 기능 (상품번호)
     *
     * @param id 상품 번호
     * @return   상품 번호에 해당하는 Goods 상품을 사용자에게 전달 Goods = 번호, 이름, 수량, 가격 포함
     */
    public Goods getGoodsById(int id){
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                System.out.println("===사용자가 찾는 상품 정보===");
                System.out.println(goods);
                return goods;
            }
        }
        System.out.println("상품"+id + "번 에 해당하는 상품을 찾을 수 없습니다.");
        return null; // 상품번호로 해당하는 상품이 없을 경우
    }

    /**  void displayAllGoods(매개변수 없음) 모든 상품 보기 기능
     * 매개변수 없음
     * 상품을 조회했을 때 상품 리스트가 존재하지 않는다면 -> 상품 없을을 출력
     * 상품 존재 유무는 isEmpty() 기능을 활용해서 목록이 비었는지 확인
     */
    public void displayAllGoods() {
        if(goodsList.isEmpty()){
            System.out.println("상품 리스트가 존재 하지 않습니다.");
        }else {
            System.out.println("=====상품 리스트=====");
            for (Goods goods : goodsList) {
                System.out.println(goods);
            }
        }
    }
    /** void removeGoods(int id) 상품 삭제하기 기능(상품번호)
     * @param id 상품번호 로 조회된 상품 삭제
     */
    public void removeGoods(int id) {
        Goods toGoods = null;

        for(Goods goods1 : goodsList){
            if(goods1.getId() == id){
                toGoods = goods1;
                goodsList.remove(goods1);
                break;
            }
        } if(toGoods == null){
            System.out.println("상품번호 " + id + "로 조회된 상품이 존재하지 않아 삭제할 수 없습니다.");

        }else {
            System.out.println("상품번호 " + id + " 에 해당하는 상품을 제거했습니다.");
        }
    }


}
