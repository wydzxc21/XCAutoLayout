//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;
import android.widget.TextView;

public class TextSizeAttr extends AutoAttr {
    public TextSizeAttr(int pxVal, int baseWidth, int baseHeight) {
        super(pxVal, baseWidth, baseHeight);
    }

    protected int attrVal() {
        return 4;
    }

    protected boolean defaultBaseWidth() {
        return false;
    }

    protected void execute(View view, int val) {
        if(view instanceof TextView) {
            ((TextView)view).setIncludeFontPadding(false);
            ((TextView)view).setTextSize(0, (float)val);
        }
    }
}
