package com.liangchao.cardetection;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class LoginActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 =(EditText) findViewById(R.id.editText2);
        Switch mSwitch1 =(Switch)findViewById(R.id.switch2) ;
        mSwitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //如果选中，显示密码
                    editText2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else {
                    //否则隐藏密码
                    editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

        findView();


    }

    //跳转界面到login_do
    private void findView(){
        editText2 =(EditText) findViewById(R.id.editText2);
        editText1 =(EditText) findViewById(R.id.editText1);

        Button button=(Button)findViewById(R.id.button);
        Button button1 = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editText1.getText().toString()) && TextUtils.isEmpty(editText2.getText().toString())){
                    AlertDialog alert=new AlertDialog.Builder(LoginActivity.this).create();
                    alert.setTitle("系统提示");
                    alert.setMessage("用户名或密码不能为空");
                    alert.show();

                }else{
                    if (editText1.getText().toString().equals("12") && editText2.getText().toString().equals("12")){
                        Intent i = new Intent(LoginActivity.this, ControlPan.class);
                        //启动
                        startActivity(i);
                    }else{
                        AlertDialog alert2=new AlertDialog.Builder(LoginActivity.this).create();
                        alert2.setTitle("系统提示");
                        alert2.setMessage("用户名或密码出错！");
                        alert2.show();

                    }
                }

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }


}
