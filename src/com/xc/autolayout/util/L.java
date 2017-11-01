package com.xc.autolayout.util;

import android.util.Log;

public class L {
	public static boolean debug = false;
	private static final String TAG = "AUTO_LAYOUT";

	public L() {
	}

	public static void e(String msg) {
		if (debug) {
			Log.e("AUTO_LAYOUT", msg);
		}

	}
}
