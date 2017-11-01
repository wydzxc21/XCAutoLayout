//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.xc.autolayout.util.AutoLayoutHelper;
import com.xc.autolayout.util.AutoLayoutUtil;
import com.xc.autolayout.util.AutoLayoutHelper.AutoLayoutParams;

public class AutoFrameLayout extends FrameLayout {
    private final AutoLayoutHelper mHelper = new AutoLayoutHelper(this);

    public AutoFrameLayout(Context context) {
        super(context);
    }

    public AutoFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AutoFrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new AutoFrameLayout.LayoutParams(this.getContext(), attrs);
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

    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams implements AutoLayoutParams {
        private AutoLayoutUtil mAutoLayoutInfo;

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.mAutoLayoutInfo = AutoLayoutHelper.getAutoLayoutInfo(c, attrs);
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(int width, int height, int gravity) {
            super(width, height, gravity);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams source) {
            super(source);
        }

        public LayoutParams(MarginLayoutParams source) {
            super(source);
        }

        public LayoutParams(android.widget.FrameLayout.LayoutParams source) {
            super(source);
            this.gravity = source.gravity;
        }

        public LayoutParams(AutoFrameLayout.LayoutParams source) {
            this((android.widget.FrameLayout.LayoutParams)source);
            this.mAutoLayoutInfo = source.mAutoLayoutInfo;
        }

        public AutoLayoutUtil getAutoLayoutInfo() {
            return this.mAutoLayoutInfo;
        }
    }
}
