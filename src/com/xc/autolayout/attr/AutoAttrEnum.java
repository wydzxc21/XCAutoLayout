//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;

public enum AutoAttrEnum {
    TEXT_SIZE {
        public void apply(View view) {
        }
    };

    private int pxVal;

    private AutoAttrEnum() {
    }

    public int getPxVal() {
        return this.pxVal;
    }

    public void setPxVal(int pxVal) {
        this.pxVal = pxVal;
    }

    public abstract void apply(View var1);
}
