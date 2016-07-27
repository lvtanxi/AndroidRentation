package com.znn.injectview;


import android.view.View;

public interface ViewBinder<T> {
  void bind(T target,View rootView);
  void unBind(T target);
}