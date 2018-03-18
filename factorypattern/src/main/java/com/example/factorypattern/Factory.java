package com.example.factorypattern;

/**
 * Created by Administrator on 2018/3/13/013.
 * 抽象工厂类
 */

public abstract class Factory {
    //抽象工厂方法，具体产生什么由子类去实现，返回具体的产品对象，clz为产品对象类类型
//    public abstract Product createProduct();
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
