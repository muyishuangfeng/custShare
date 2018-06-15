package com.tianyu.share.widget.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tianyu.share.R;
import com.tianyu.share.base.BaseActivity;

public class RegisterActivity extends BaseActivity {

    EditText mEdtPass,mEdtNickName,mEdtPhone,mEdtCode,mEdtPhoneCode,mEdtAgent;
    Button mBtnCode,mBtnRegister;

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_register);
    }

    @Override
    public void initView() {
        mEdtAgent=$(R.id.edt_agent);
        mEdtCode=$(R.id.edt_code);
        mEdtNickName=$(R.id.edt_nick_name);
        mEdtPass=$(R.id.edt_register_pass);
        mEdtPhone=$(R.id.edt_phone);
        mEdtPhoneCode=$(R.id.edt_phone_code);
        mBtnRegister=$(R.id.btn_register);
        mBtnCode=$(R.id.btn_get_code);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initClick(View view) {
      switch (view.getId()){
          case R.id.btn_get_code:{//获取验证码
              break;
          }
          case R.id.btn_register:{//注册
              break;
          }
      }
    }

    @Override
    public void setListener() {
     mBtnCode.setOnClickListener(this);
     mBtnRegister.setOnClickListener(this);
    }

    @Override
    protected void initIntentParam(Intent intent) {

    }
}
