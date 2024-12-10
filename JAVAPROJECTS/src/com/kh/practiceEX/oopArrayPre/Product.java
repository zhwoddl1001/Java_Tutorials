package com.kh.practiceEX.oopArrayPre;

public class Product {
    private int price;
    private String name;
    private String description;
    private String category;
    
    //setter 저장
    //선택적으로 상품설명과 카테고리는 선택사항으로 저장유무 결정

    //getter 경우 매개변수생성자(파라미터) 나 setter로 가져온 정보반환

    public Product() {
    }

    public Product(String name, int price) {
        this.price = price;
        this.name = name;
        // this.description = description;
       //  this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "제품명 ="  + name + ", \n 제품가격 =" + price + "\n 제품설명='" + description + "\n 카테고리 ='" + category ;
    }
}
