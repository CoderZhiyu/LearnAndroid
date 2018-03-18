package com.example.factorypattern;

import android.util.Log;

/**
 * Created by Administrator on 2018/3/13/013.
 */

public class ProductA extends Product{
    @Override
    public void method() {
        Log.d("ProductA","我是具体的产品A");
    }
}
