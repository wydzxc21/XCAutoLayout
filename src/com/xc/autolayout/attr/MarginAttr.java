//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public class MarginAttr extends AutoAttr {
    public MarginAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 16;
    }

    protected boolean defaultBaseWidth() {
        return false;
    }

    public void apply(View view) {
        if(view.getLayoutParams() instanceof MarginLayoutParams) {
            if(this.useDefault()) {
                MarginLayoutParams lp = (MarginLayoutParams)view.getLayoutParams();
                lp.leftMargin = lp.rightMargin = this.getPercentWidthSize();
                lp.topMargin = lp.bottomMargin = this.getPercentHeightSize();
            } else {
                super.apply(view);
            }
        }
    }

    protected void execute(View view, int val) {
        MarginLayoutParams lp = (MarginLayoutParams)view.getLayoutParams();
        lp.leftMargin = lp.rightMargin = lp.topMargin = lp.bottomMargin = val;
    }
}
