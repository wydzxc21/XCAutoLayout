//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.xc.autolayout.util;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xc.autolayout.attr.AutoAttr;

public class AutoLayoutUtil {
    private List<AutoAttr> autoAttrs = new ArrayList();

    public AutoLayoutUtil() {
    }

    public void addAttr(AutoAttr autoAttr) {
        this.autoAttrs.add(autoAttr);
    }

    public void fillAttrs(View view) {
        Iterator var3 = this.autoAttrs.iterator();

        while(var3.hasNext()) {
            AutoAttr autoAttr = (AutoAttr)var3.next();
            autoAttr.apply(view);
        }

    }

    public String toString() {
        return "AutoLayoutInfo{autoAttrs=" + this.autoAttrs + '}';
    }
}
