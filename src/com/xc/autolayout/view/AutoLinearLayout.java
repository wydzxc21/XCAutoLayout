//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.xc.autolayout.util.AutoLayoutHelper;
import com.xc.autolayout.util.AutoLayoutUtil;
import com.xc.autolayout.util.AutoLayoutHelper.AutoLayoutParams;

public class AutoLinearLayout extends LinearLayout {
    private AutoLayoutHelper mHelper = new AutoLayoutHelper(this);

    public AutoLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if(!this.isInEditMode()) {
            this.mHelper.adjustChildren();
        }

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    public AutoLinearLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new AutoLinearLayout.LayoutParams(this.getContext(), attrs);
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams implements AutoLayoutParams {
        private AutoLayoutUtil mAutoLayoutInfo;

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.mAutoLayoutInfo = AutoLayoutHelper.getAutoLayoutInfo(c, attrs);
        }

        public AutoLayoutUtil getAutoLayoutInfo() {
            return this.mAutoLayoutInfo;
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams source) {
            super(source);
        }

        public LayoutParams(MarginLayoutParams source) {
            super(source);
        }
    }
}
