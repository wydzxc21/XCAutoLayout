//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;

public class PaddingBottomAttr extends AutoAttr {
    public PaddingBottomAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 4096;
    }

    protected boolean defaultBaseWidth() {
        return false;
    }

    protected void execute(View view, int val) {
        int l = view.getPaddingLeft();
        int t = view.getPaddingTop();
        int r = view.getPaddingRight();
        view.setPadding(l, t, r, val);
    }
}
