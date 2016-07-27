package com.znn.injectview;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.IdRes;
import android.view.View;

/**
 * User: 吕勇
 * Date: 2016-07-27
 * Time: 13:08
 * Description:
 */
public class Finder {
    public static <T extends View> T findView(Object tag, View rootView, @IdRes int viewId) {
        if (null != rootView) {
            return (T) rootView.findViewById(viewId);
        } else if (tag instanceof Activity) {
            return (T) ((Activity) tag).findViewById(viewId);
        } else if (tag instanceof View) {
            return (T) ((View) tag).findViewById(viewId);
        } else if (tag instanceof Dialog) {
            return (T) ((Dialog) tag).findViewById(viewId);
        }
        return null;
    }
}
