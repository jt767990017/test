package com.ytc.text.november28_copy;

import java.util.Scanner;

public class GoodsAction extends Goods {
    public Scanner scanner = new Scanner(System.in);


    public Goods addGoods() {
        Goods goods = new Goods();
        System.out.println("ID");
        goods.setGoodsId(scanner.nextInt());

        System.out.println("商品名称");
        goods.setGoodsName(scanner.next());

        System.out.println("价格");
        goods.setGoodsPrice(scanner.nextInt());

        System.out.println("生产日期");
        goods.setGoodsString(scanner.next());

        System.out.println("商品类型");
        goods.setGoodsType(scanner.next());

        return goods;
    }

    public static void main(String[] args) {
        System.out.println(new GoodsAction().addGoods());

    }
}

