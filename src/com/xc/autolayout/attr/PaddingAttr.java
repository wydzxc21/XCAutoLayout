//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.attr;

import android.view.View;

public class PaddingAttr extends AutoAttr {
	public PaddingAttr(int pxVal, int baseWidth, int baseHeight) {
		super(pxVal, baseWidth, baseHeight);
	}

	protected int attrVal() {
		return 8;
	}

	public void apply(View view) {
		if (this.useDefault()) {
			int r;
			int l = r = this.getPercentWidthSize();
			int b;
			int t = b = this.getPercentHeightSize();
			view.setPadding(l, t, r, b);
		} else {
			super.apply(view);
		}
	}

	protected boolean defaultBaseWidth() {
		return false;
	}

	protected void execute(View view, int val) {
		view.setPadding(val, val, val, val);
	}
}
