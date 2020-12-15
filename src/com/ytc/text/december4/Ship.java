package com.ytc.text.december4;

public class Ship {
    private String skipper;     //船长
    private double height;     //高度
    private double width;  //宽度
    private double depth;  //深度

    public Ship(String skipper, double height, double width, double depth) {
        this.skipper = skipper;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public String getSkipper() {
        return skipper;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
}


class A {
    public static void main(String[] args) {
        Ship ship = new Ship("史密斯", 1300, 40, 40);
        Ship ship1 = new Ship("詹姆斯", 200, 40, 60);

        compare(ship, ship1);
        System.out.println("ship排水量：" + displacement(ship.getHeight(), ship.getWidth(), ship.getDepth()));
        System.out.println("ship1排水量：" + displacement(ship1.getHeight(), ship1.getWidth(), ship1.getDepth()));
    }

    //计算排水量
    public static int displacement(double height, double width, double depth) {
        return (int) (height * width * depth);
    }

    public static void compare(Ship ship, Ship ship1) {
        String str = "";
        if (ship.getHeight() > ship1.getHeight()) {
            str = ship.getSkipper() + "，" + ship.getHeight() + "，" + ship.getWidth() + "，" + ship.getDepth() + "，" + ship1.getSkipper();
        } else {
            str = ship1.getSkipper() + "，" + ship1.getHeight() + "，" + ship1.getWidth() + "，" + ship1.getDepth() + "，" + ship.getSkipper();
        }

        System.out.println(str.split("，")[0] + "船长的传高" + str.split("，")[1] + "米，宽"
                + str.split("，")[2] + "米，深" + str.split("，")[3] + "米，比" + str.split("，")[4] + "船长的船大");
    }
}