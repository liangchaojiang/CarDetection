package com.liangchao.cardetection;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class ControlPan extends Activity {

    private final String TAG = "TAG";
    private MyGridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.controlpan);
        gridView = (MyGridView)this.findViewById(R.id.main_gridview);

        gridView.setAdapter(new MyGridViewAdapter(this));
    }
}
