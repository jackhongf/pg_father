package com.vincent.hong.design.factory.GeneralFactory;

public class CarFactory {

    public  AbstractCar  creatBaoMaCar(){
        return new BaoMaCar();
    }

    public  AbstractCar  creatBenzCar(){
        return new BenzCar();
    }

    public static  AbstractCar  creatStaticBaoMaCar(){
        return new BaoMaCar();
    }

    public static AbstractCar  creatStaticBenzCar(){
        return new BenzCar();
    }


    public static void main(String [] args){
        //测试普通工厂
        testGeneralFactory();
        System.out.println("------------------------分割线-----------------------------");
        //测试静态工厂方法
        testStaticGeneralFactory();
    }

    private static void testGeneralFactory(){
        System.out.println("普通工厂方法生产汽车：");
        CarFactory factory = new CarFactory();
        AbstractCar baoMaCar =factory.creatBaoMaCar();
        baoMaCar.createCar();

        AbstractCar benzCar =factory.creatBenzCar();
        benzCar.createCar();
    }

    private static void testStaticGeneralFactory(){
        System.out.println("静态工厂方法生产汽车：");
        AbstractCar  baoMaCar = CarFactory.creatStaticBaoMaCar();
        baoMaCar.createCar();

        AbstractCar  benzCar = CarFactory.creatStaticBenzCar();
        benzCar.createCar();
    }


}
