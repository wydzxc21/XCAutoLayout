//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.util;

import com.xc.autolayout.config.AutoLayoutConifg;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class XCAutoUtil {
    public XCAutoUtil() {
    }

    public static void auto(View view) {
        autoSize(view);
        autoPadding(view);
        autoMargin(view);
    }

    public static void autoMargin(View view) {
        if(view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams lp = (MarginLayoutParams)view.getLayoutParams();
            if(lp != null) {
                lp.leftMargin = getPercentWidthSize(lp.leftMargin);
                lp.topMargin = getPercentHeightSize(lp.topMargin);
                lp.rightMargin = getPercentWidthSize(lp.rightMargin);
                lp.bottomMargin = getPercentHeightSize(lp.bottomMargin);
            }
        }
    }

    public static void autoPadding(View view) {
        int l = view.getPaddingLeft();
        int t = view.getPaddingTop();
        int r = view.getPaddingRight();
        int b = view.getPaddingBottom();
        l = getPercentWidthSize(l);
        t = getPercentHeightSize(t);
        r = getPercentWidthSize(r);
        b = getPercentHeightSize(b);
        view.setPadding(l, t, r, b);
    }

    public static void autoSize(View view) {
        LayoutParams lp = view.getLayoutParams();
        if(lp != null) {
            int screenHeight;
            int designHeight;
            if(lp.width > 0) {
                screenHeight = AutoLayoutConifg.getInstance().getScreenWidth();
                designHeight = AutoLayoutConifg.getInstance().getDesignWidth();
                lp.width = (int)((float)lp.width * 1.0F / (float)designHeight * (float)screenHeight);
            }

            if(lp.height > 0) {
                screenHeight = AutoLayoutConifg.getInstance().getScreenHeight();
                designHeight = AutoLayoutConifg.getInstance().getDesignHeight();
                lp.height = (int)((float)lp.height * 1.0F / (float)designHeight * (float)screenHeight);
            }

        }
    }

    public static int getPercentWidthSize(int val) {
        int screenWidth = AutoLayoutConifg.getInstance().getScreenWidth();
        int designWidth = AutoLayoutConifg.getInstance().getDesignWidth();
        return (int)((float)val * 1.0F / (float)designWidth * (float)screenWidth);
    }

    public static int getPercentHeightSize(int val) {
        int screenHeight = AutoLayoutConifg.getInstance().getScreenHeight();
        int designHeight = AutoLayoutConifg.getInstance().getDesignHeight();
        return (int)((float)val * 1.0F / (float)designHeight * (float)screenHeight);
    }
}
