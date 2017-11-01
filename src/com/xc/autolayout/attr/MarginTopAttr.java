//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public class MarginTopAttr extends AutoAttr {
    public MarginTopAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 64;
    }

    protected boolean defaultBaseWidth() {
        return false;
    }

    protected void execute(View view, int val) {
        if(view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams lp = (MarginLayoutParams)view.getLayoutParams();
            lp.topMargin = val;
        }
    }
}
