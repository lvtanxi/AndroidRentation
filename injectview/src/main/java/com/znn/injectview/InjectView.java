package com.znn.injectview;

import android.app.Activity;
import android.view.View;

/**
 * @author RANDY
 *         2016/5/23
 */

public class InjectView {
    public static void bind(Activity activity){
        bind(activity , null);
    }

    public static void bind(Object target , View rootView){
        String clsName = target.getClass().getName();
        try {
            Class<?> viewBindingClass = Class.forName(clsName + "$$ViewBinder");
            ViewBinder viewBinder = (ViewBinder)viewBindingClass.newInstance();
            viewBinder.bind(target,rootView);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void unBind(Object target){
        String clsName = target.getClass().getName();
        try {
            Class<?> viewBindingClass = Class.forName(clsName + "$$ViewBinder");
            ViewBinder viewBinder = (ViewBinder)viewBindingClass.newInstance();
            viewBinder.unBind(target);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
