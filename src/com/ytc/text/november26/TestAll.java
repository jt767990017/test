package com.ytc.text.november26;


public class TestAll extends A implements Deng {

    public static void main(String[] args) {
        new Deng() {
            @Override
            public void Glow() {
                System.out.println("匿名内部类：" + Deng.LowestVoltage + "V电压有发光");
            }
        }.Glow();

        new TestAll().Glow();

        System.out.println("==================");

        Person s = new Student();
        s.study();
        System.out.println("------------------------");
        Person t =new Teacher();
        t.study();







    }


    @Override
    public void Glow() {
        System.out.println(Deng.LowestVoltage + "V电压有发光");
    }
}
