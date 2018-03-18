package com.example.factorypattern;

import android.util.Log;

/**
 * Created by Administrator on 2018/3/13/013.
 */

public class ProductB extends Product{
    @Override
    public void method() {
        Log.d("ProductB","我是具体的产品B");
    }
}
