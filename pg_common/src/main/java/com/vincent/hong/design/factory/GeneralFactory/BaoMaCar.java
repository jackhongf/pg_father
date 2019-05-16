package com.vincent.hong.design.factory.GeneralFactory;

public class BaoMaCar implements AbstractCar {

    @Override
    public void createCar() {
        System.out.println("恭喜，宝马汽车已生产成功。");
    }
}
