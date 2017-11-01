package com.xc.autolayout.attr;

import com.xc.autolayout.util.L;
import com.xc.autolayout.util.XCAutoUtil;

import android.view.View;

public abstract class AutoAttr {

    protected int pxVal;
    protected int baseWidth;
    protected int baseHeight;

    public AutoAttr(int pxVal, int baseWidth, int baseHeight) {
        this.pxVal = pxVal;
        this.baseWidth = baseWidth;
        this.baseHeight = baseHeight;
    }

    public void apply(View view) {
        boolean log = view.getTag() != null && view.getTag().toString().equals("auto");
        if(log) {
            L.e(" pxVal = " + this.pxVal + " ," + this.getClass().getSimpleName());
        }

        int val;
        if(this.useDefault()) {
            val = this.defaultBaseWidth()?this.getPercentWidthSize():this.getPercentHeightSize();
            if(log) {
                L.e(" useDefault val= " + val);
            }
        } else if(this.baseWidth()) {
            val = this.getPercentWidthSize();
            if(log) {
                L.e(" baseWidth val= " + val);
            }
        } else {
            val = this.getPercentHeightSize();
            if(log) {
                L.e(" baseHeight val= " + val);
            }
        }

        val = Math.max(val, 1);
        this.execute(view, val);
    }

    protected int getPercentWidthSize() {
        return XCAutoUtil.getPercentWidthSize(this.pxVal);
    }

    protected int getPercentHeightSize() {
        return XCAutoUtil.getPercentHeightSize(this.pxVal);
    }

    protected boolean baseWidth() {
        return this.contains(this.baseWidth, this.attrVal());
    }

    protected boolean useDefault() {
        return !this.contains(this.baseHeight, this.attrVal()) && !this.contains(this.baseWidth, this.attrVal());
    }

    protected boolean contains(int baseVal, int flag) {
        return (baseVal & flag) != 0;
    }

    protected abstract int attrVal();

    protected abstract boolean defaultBaseWidth();

    protected abstract void execute(View var1, int var2);

    public String toString() {
        return "AutoAttr{pxVal=" + this.pxVal + ", baseWidth=" + this.baseWidth() + ", defaultBaseWidth=" + this.defaultBaseWidth() + '}';
    }
}
