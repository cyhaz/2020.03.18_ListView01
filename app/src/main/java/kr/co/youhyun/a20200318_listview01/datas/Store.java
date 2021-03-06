package kr.co.youhyun.a20200318_listview01.datas;

import java.io.Serializable;

public class Store implements Serializable {

    private String name;
    private int rating;  //별을 몇개 찍어줘야 하는지 (평점)

//    생성자와 게터세터 생성 (Alt + Insert)
    public Store(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
