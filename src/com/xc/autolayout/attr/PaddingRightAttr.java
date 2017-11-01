//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;

public class PaddingRightAttr extends AutoAttr {
    public PaddingRightAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 2048;
    }

    protected boolean defaultBaseWidth() {
        return true;
    }

    protected void execute(View view, int val) {
        int l = view.getPaddingLeft();
        int t = view.getPaddingTop();
        int b = view.getPaddingBottom();
        view.setPadding(l, t, val, b);
    }
}
