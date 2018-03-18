package com.example.factorypattern;

/**
 * Created by Administrator on 2018/3/13/013.
 * 具体工厂类
 */

public class ConcreateFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
         Product product = null;
        try {
            //通过反射获取类的示例
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
//    @Override
//    public Product createProduct() {
//        return new ProductA();
//    }
}
