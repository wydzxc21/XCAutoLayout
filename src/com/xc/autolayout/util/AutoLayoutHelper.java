//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

import com.xc.autolayout.attr.HeightAttr;
import com.xc.autolayout.attr.MarginAttr;
import com.xc.autolayout.attr.MarginBottomAttr;
import com.xc.autolayout.attr.MarginLeftAttr;
import com.xc.autolayout.attr.MarginRightAttr;
import com.xc.autolayout.attr.MarginTopAttr;
import com.xc.autolayout.attr.PaddingAttr;
import com.xc.autolayout.attr.PaddingBottomAttr;
import com.xc.autolayout.attr.PaddingLeftAttr;
import com.xc.autolayout.attr.PaddingRightAttr;
import com.xc.autolayout.attr.PaddingTopAttr;
import com.xc.autolayout.attr.TextSizeAttr;
import com.xc.autolayout.attr.WidthAttr;
import com.xc.autolayout.config.AutoLayoutConifg;

public class AutoLayoutHelper {
	private final ViewGroup mHost;
	private static final int[] LL = new int[] { 16842901, 16842965, 16842966, 16842967, 16842968, 16842969, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002 };
	// private static final int INDEX_TEXT_SIZE = 0;
	// private static final int INDEX_PADDING = 1;
	// private static final int INDEX_PADDING_LEFT = 2;
	// private static final int INDEX_PADDING_TOP = 3;
	// private static final int INDEX_PADDING_RIGHT = 4;
	// private static final int INDEX_PADDING_BOTTOM = 5;
	// private static final int INDEX_WIDTH = 6;
	// private static final int INDEX_HEIGHT = 7;
	// private static final int INDEX_MARGIN = 8;
	// private static final int INDEX_MARGIN_LEFT = 9;
	// private static final int INDEX_MARGIN_TOP = 10;
	// private static final int INDEX_MARGIN_RIGHT = 11;
	// private static final int INDEX_MARGIN_BOTTOM = 12;
	private static AutoLayoutConifg mAutoLayoutConifg;

	public AutoLayoutHelper(ViewGroup host) {
		this.mHost = host;
		if (mAutoLayoutConifg == null) {
			this.initAutoLayoutConfig(host);
		}

	}

	private void initAutoLayoutConfig(ViewGroup host) {
		mAutoLayoutConifg = AutoLayoutConifg.getInstance();
		mAutoLayoutConifg.init(host.getContext());
	}

	public void adjustChildren() {
		int i = 0;

		for (int n = this.mHost.getChildCount(); i < n; ++i) {
			View view = this.mHost.getChildAt(i);
			LayoutParams params = view.getLayoutParams();
			if (params instanceof AutoLayoutHelper.AutoLayoutParams) {
				AutoLayoutUtil info = ((AutoLayoutHelper.AutoLayoutParams) params).getAutoLayoutInfo();
				if (info != null) {
					info.fillAttrs(view);
				}
			}
		}

	}

	public static AutoLayoutUtil getAutoLayoutInfo(Context context, AttributeSet attrs) {
		AutoLayoutConifg.getInstance().checkParams();
		AutoLayoutUtil info = new AutoLayoutUtil();
		byte baseWidth = 0;
		byte baseHeight = 0;
		TypedArray array = context.obtainStyledAttributes(attrs, LL);
		if (array != null) {
			for (int i = 0; i < array.getIndexCount(); ++i) {
				int index = array.getIndex(i);
				String val = array.getString(index);
				if (isPxOrDipVal(val)) {
					int var13;
					try {
						var13 = array.getDimensionPixelOffset(index, 0);
					} catch (Exception var12) {
						continue;
					}
					//
					switch (index) {
					case 0:
						info.addAttr(new TextSizeAttr(var13, baseWidth, baseHeight));
						break;
					case 1:
						info.addAttr(new PaddingAttr(var13, baseWidth, baseHeight));
						break;
					case 2:
						info.addAttr(new PaddingLeftAttr(var13, baseWidth, baseHeight));
						break;
					case 3:
						info.addAttr(new PaddingTopAttr(var13, baseWidth, baseHeight));
						break;
					case 4:
						info.addAttr(new PaddingRightAttr(var13, baseWidth, baseHeight));
						break;
					case 5:
						info.addAttr(new PaddingBottomAttr(var13, baseWidth, baseHeight));
						break;
					case 6:
						info.addAttr(new WidthAttr(var13, baseWidth, baseHeight));
						break;
					case 7:
						info.addAttr(new HeightAttr(var13, baseWidth, baseHeight));
						break;
					case 8:
						info.addAttr(new MarginAttr(var13, baseWidth, baseHeight));
						break;
					case 9:
						info.addAttr(new MarginLeftAttr(var13, baseWidth, baseHeight));
						break;
					case 10:
						info.addAttr(new MarginTopAttr(var13, baseWidth, baseHeight));
						break;
					case 11:
						info.addAttr(new MarginRightAttr(var13, baseWidth, baseHeight));
						break;
					case 12:
						info.addAttr(new MarginBottomAttr(var13, baseWidth, baseHeight));
					}
				}
			}
		}
		array.recycle();
		L.e(" getAutoLayoutInfo " + info.toString());
		return info;
	}

	private static boolean isPxOrDipVal(String val) {
		if (val.endsWith("px") || val.endsWith("dp") || val.endsWith("dip")) {
			return true;
		}
		return false;
		// return val.endsWith("px");
	}

	public interface AutoLayoutParams {
		AutoLayoutUtil getAutoLayoutInfo();
	}
}
