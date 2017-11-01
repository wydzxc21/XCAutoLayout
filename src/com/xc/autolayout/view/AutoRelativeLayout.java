//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.xc.autolayout.util.AutoLayoutHelper;
import com.xc.autolayout.util.AutoLayoutUtil;
import com.xc.autolayout.util.AutoLayoutHelper.AutoLayoutParams;

public class AutoRelativeLayout extends RelativeLayout {
    private final AutoLayoutHelper mHelper = new AutoLayoutHelper(this);

    public AutoRelativeLayout(Context context) {
        super(context);
    }

    public AutoRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public AutoRelativeLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new AutoRelativeLayout.LayoutParams(this.getContext(), attrs);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if(!this.isInEditMode()) {
            this.mHelper.adjustChildren();
        }

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    public static class LayoutParams extends android.widget.RelativeLayout.LayoutParams implements AutoLayoutParams {
        private AutoLayoutUtil mAutoLayoutInfo;

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.mAutoLayoutInfo = AutoLayoutHelper.getAutoLayoutInfo(c, attrs);
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

        public AutoLayoutUtil getAutoLayoutInfo() {
            return this.mAutoLayoutInfo;
        }
    }
}
