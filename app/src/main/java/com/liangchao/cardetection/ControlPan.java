package com.liangchao.cardetection;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Toast;

public class ControlPan extends Activity {

    private final String TAG = "TAG";
    private MyGridView gridView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.controlpan);

        context = this;
        gridView = (MyGridView)this.findViewById(R.id.main_gridview);

        gridView.setAdapter(new MyGridViewAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                      Toast t =   Toast.makeText(context,"posion 0 ",Toast.LENGTH_LONG);
                      t.show();
                        break;
                    case 1:
                        Toast t1 =   Toast.makeText(context,"posion 1 ",Toast.LENGTH_LONG);
                        t1.show();
                        break;
                    case 2:
                        Toast t2 =   Toast.makeText(context,"posion 2 ",Toast.LENGTH_LONG);
                        t2.show();
                        break;
                    case 3:
                        Toast t3 =   Toast.makeText(context,"posion 3 ",Toast.LENGTH_LONG);
                        t3.show();
                        break;
                }
            }
        });
    }
}
