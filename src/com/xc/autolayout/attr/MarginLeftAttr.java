//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public class MarginLeftAttr extends AutoAttr {
    public MarginLeftAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 32;
    }

    protected boolean defaultBaseWidth() {
        return true;
    }

    protected void execute(View view, int val) {
        if(view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams lp = (MarginLayoutParams)view.getLayoutParams();
            lp.leftMargin = val;
        }
    }
}
