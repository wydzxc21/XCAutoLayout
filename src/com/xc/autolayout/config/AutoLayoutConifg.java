package com.xc.autolayout.config;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

import com.xc.autolayout.util.L;
import com.xc.autolayout.util.ScreenUtil;

public class AutoLayoutConifg {
    private static AutoLayoutConifg sIntance = new AutoLayoutConifg();
    private static final String KEY_DESIGN_WIDTH = "design_width";
    private static final String KEY_DESIGN_HEIGHT = "design_height";
    private int mScreenWidth;
    private int mScreenHeight;
    private int mDesignWidth;
    private int mDesignHeight;

    private AutoLayoutConifg() {
    }

    public void checkParams() {
        if(this.mDesignHeight <= 0 || this.mDesignWidth <= 0) {
            throw new RuntimeException("you must set design_width and design_height  in your manifest file.");
        }
    }

    public static AutoLayoutConifg getInstance() {
        return sIntance;
    }

    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    public int getDesignWidth() {
        return this.mDesignWidth;
    }

    public int getDesignHeight() {
        return this.mDesignHeight;
    }

    public void init(Context context) {
        this.getMetaData(context);
        int[] screenSize = ScreenUtil.getScreenSize(context);
        this.mScreenWidth = screenSize[0];
        this.mScreenHeight = screenSize[1];
        L.e(" screenWidth =" + this.mScreenWidth + " ,screenHeight = " + this.mScreenHeight);
    }

    private void getMetaData(Context context) {
        PackageManager packageManager = context.getPackageManager();

        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if(applicationInfo != null && applicationInfo.metaData != null) {
                this.mDesignWidth = ((Integer)applicationInfo.metaData.get("design_width")).intValue();
                this.mDesignHeight = ((Integer)applicationInfo.metaData.get("design_height")).intValue();
            }
        } catch (NameNotFoundException var5) {
            throw new RuntimeException("you must set design_width and design_height  in your manifest file.", var5);
        }

        L.e(" designWidth =" + this.mDesignWidth + " , designHeight = " + this.mDesignHeight);
    }
}
