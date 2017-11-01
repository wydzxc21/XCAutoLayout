//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.xc.autolayout.util.XCAutoUtil;

public abstract class AutoLayoutAdapter extends BaseAdapter {
	public AutoLayoutAdapter() {
	}

	protected abstract View getViews(int position, View convertView, ViewGroup parent);

	public View getView(int position, View convertView, ViewGroup parent) {
		View views = this.getViews(position, convertView, parent);
		if (views != null) {
			XCAutoUtil.auto(views);
		}
		return views;
	}
}
