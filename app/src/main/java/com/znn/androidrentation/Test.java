package com.znn.androidrentation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.znn.injectview.InjectView;
import com.znn.injectview.annotations.BindView;

/**
 * User: 吕勇
 * Date: 2016-07-27
 * Time: 11:33
 * Description:
 */
public class Test extends Fragment{
    @BindView(R.id.text)
    TextView textView;
    @BindView(R.id.text2)
    TextView textView2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.activity_main, null);
        InjectView.bind(this,inflate);
        return inflate;
    }
}
