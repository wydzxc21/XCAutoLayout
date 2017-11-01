//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.View;

import com.xc.autolayout.view.AutoFrameLayout;
import com.xc.autolayout.view.AutoLinearLayout;
import com.xc.autolayout.view.AutoRelativeLayout;

public class AutoLayoutActivity extends FragmentActivity {
	private static final String LAYOUT_FRAMELAYOUT = "FrameLayout";
	private static final String LAYOUT_LINEARLAYOUT = "LinearLayout";
	private static final String LAYOUT_RELATIVELAYOUT = "RelativeLayout";

	public AutoLayoutActivity() {
	}

	public View onCreateView(String name, Context context, AttributeSet attrs) {
		Object view = null;
		if (name.equals(LAYOUT_FRAMELAYOUT)) {
			view = new AutoFrameLayout(context, attrs);
		}

		if (name.equals(LAYOUT_LINEARLAYOUT)) {
			view = new AutoLinearLayout(context, attrs);
		}

		if (name.equals(LAYOUT_RELATIVELAYOUT)) {
			view = new AutoRelativeLayout(context, attrs);
		}

		return (View) (view != null ? view : super.onCreateView(name, context, attrs));
	}
}
