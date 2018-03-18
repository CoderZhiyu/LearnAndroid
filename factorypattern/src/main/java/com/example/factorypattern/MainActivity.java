package com.example.factorypattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 工厂方法模式
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //客户端调用
        Factory concreateFactory = new ConcreateFactory();
        //通过传入Class类来决定是哪一个产品类
        Product product = concreateFactory.createProduct(ProductB.class);
        product.method();
    }
}
