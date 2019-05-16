package com.vincent.hong.design.factory.GeneralFactory;

public class BenzCar implements AbstractCar {
    @Override
    public void createCar() {
        System.out.println("恭喜，奔驰汽车已生产成功。");
    }
}
