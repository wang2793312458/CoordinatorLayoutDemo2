package com.example.coordinatorlayoutdemo.base;

import android.app.Application;

import com.example.coordinatorlayoutdemo.utils.Utils;


/**
 * Created by sunhuahui on 2017/1/29.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
