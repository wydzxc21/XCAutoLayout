//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xc.autolayout.util.XCAutoUtil;

public class AutoLayoutFragment extends Fragment {
	public AutoLayoutFragment() {
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View createView = super.onCreateView(inflater, container, savedInstanceState);
		if (createView != null) {
			XCAutoUtil.autoSize(createView);
		}
		return createView;
	}
}
