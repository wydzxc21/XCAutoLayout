//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.util;

import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ScreenUtil {
    public ScreenUtil() {
    }

    public static int[] getScreenSize(Context context) {
        int[] size = new int[2];
        WindowManager w = (WindowManager)context.getSystemService("window");
        Display d = w.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        d.getMetrics(metrics);
        int widthPixels = metrics.widthPixels;
        int heightPixels = metrics.heightPixels;
        if(VERSION.SDK_INT >= 14 && VERSION.SDK_INT < 17) {
            try {
                widthPixels = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(d, new Object[0])).intValue();
                heightPixels = ((Integer)Display.class.getMethod("getRawHeight", new Class[0]).invoke(d, new Object[0])).intValue();
            } catch (Exception var9) {
                ;
            }
        }

        if(VERSION.SDK_INT >= 17) {
            try {
                Point realSize = new Point();
                Display.class.getMethod("getRealSize", new Class[]{Point.class}).invoke(d, new Object[]{realSize});
                widthPixels = realSize.x;
                heightPixels = realSize.y;
            } catch (Exception var8) {
                ;
            }
        }

        size[0] = widthPixels;
        size[1] = heightPixels;
        return size;
    }
}
