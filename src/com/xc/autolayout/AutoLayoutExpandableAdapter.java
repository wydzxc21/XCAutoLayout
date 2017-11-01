//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import com.xc.autolayout.util.XCAutoUtil;

public abstract class AutoLayoutExpandableAdapter extends BaseExpandableListAdapter {
	public AutoLayoutExpandableAdapter() {
	}

	protected abstract View getGroupViews(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent);

	public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
		View views = this.getGroupViews(groupPosition, isExpanded, convertView, parent);
		if (views != null) {
			XCAutoUtil.auto(views);
		}
		return views;
	}

	protected abstract View getChildViews(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent);

	public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
		View views = this.getChildViews(groupPosition, childPosition, isLastChild, convertView, parent);
		if (views != null) {
			XCAutoUtil.auto(views);
		}
		return views;
	}
}
