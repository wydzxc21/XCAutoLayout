//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class HeightAttr extends AutoAttr {
    public HeightAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 2;
    }

    protected boolean defaultBaseWidth() {
        return false;
    }

    protected void execute(View view, int val) {
        LayoutParams lp = view.getLayoutParams();
        lp.height = val;
    }
}
