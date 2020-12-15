package com.ytc.text.november26_copy;

public class NewInterfaceImpl implements NewInterface {


    @Override
    public void show() {
        System.out.println("aaaaaaaaaaaaa");
    }

    @Override
    public int getArraysSortAll() {
        return 10;
    }

    @Override
    public A getArraysSortAl1l() {
        return null;
    }
}

class uun {
    public static void main(String[] args) {
        System.out.println(NewInterface.NUM);
        System.out.println(NewInterface.NUM1);

        System.out.println("========================");


        NewInterface newInterface = new NewInterfaceImpl();
        newInterface.show();

        System.out.println(newInterface.getArraysSortAll());
    }
}