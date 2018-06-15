package com.tianyu.share.widget.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.tianyu.share.R;
import com.tianyu.share.base.BaseActivity;
import com.tianyu.share.ui.CustomTitleBar;

public class LoginActivity extends BaseActivity implements
        CustomTitleBar.TitleClickListener {

    TextView mTxtForget,mTxtRegister;
    EditText mEdtName,mEdtPass;
    Button mBtnLogin;
    CheckBox mCkbRemember;
    CustomTitleBar mTitle;


    @Override
    public void setContentView() {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void initView() {
        mTitle=$(R.id.login_title);
        mTxtForget=$(R.id.txt_forget_pass);
        mTxtRegister=$(R.id.txt_register);
        mEdtName=$(R.id.edt_user_name);
        mEdtPass=$(R.id.edt_user_pass);
        mBtnLogin=$(R.id.btn_login);
        mCkbRemember=$(R.id.ckb_forget);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initClick(View view) {
     switch (view.getId()){
     case R.id.txt_forget_pass:{//忘记密码
        break;
     }
     case R.id.txt_register:{//注册
         //跳转到注册页面
         startActivity(RegisterActivity.class);
        break;
     }
     case R.id.btn_login:{//登录
        break;
     }

   }
    }

    @Override
    public void setListener() {
     mTitle.setTitleClickListener(this);
     mTxtRegister.setOnClickListener(this);
     mBtnLogin.setOnClickListener(this);
     mTxtForget.setOnClickListener(this);
    }

    @Override
    protected void initIntentParam(Intent intent) {

    }

    @Override
    public void onLeftClick() {
        finish();
    }

    @Override
    public void onRightClick() {

    }
}
