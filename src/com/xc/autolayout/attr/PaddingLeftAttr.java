//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;

public class PaddingLeftAttr extends AutoAttr {
    public PaddingLeftAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 512;
    }

    protected boolean defaultBaseWidth() {
        return true;
    }

    protected void execute(View view, int val) {
        int t = view.getPaddingTop();
        int r = view.getPaddingRight();
        int b = view.getPaddingBottom();
        view.setPadding(val, t, r, b);
    }
}
