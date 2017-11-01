//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;

public class PaddingTopAttr extends AutoAttr {
    public PaddingTopAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 1024;
    }

    protected boolean defaultBaseWidth() {
        return false;
    }

    protected void execute(View view, int val) {
        int l = view.getPaddingLeft();
        int r = view.getPaddingRight();
        int b = view.getPaddingBottom();
        view.setPadding(l, val, r, b);
    }
}
