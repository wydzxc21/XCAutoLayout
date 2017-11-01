//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class WidthAttr extends AutoAttr {
    public WidthAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 1;
    }

    protected boolean defaultBaseWidth() {
        return true;
    }

    protected void execute(View view, int val) {
        LayoutParams lp = view.getLayoutParams();
        lp.width = val;
    }
}
