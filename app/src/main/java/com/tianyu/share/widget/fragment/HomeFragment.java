package com.tianyu.share.widget.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tianyu.share.R;
import com.tianyu.share.base.BaseFragment;
import com.tianyu.share.widget.activity.LoginActivity;

/**
 * Created by lenovo on 2018/6/15.
 * 首页
 */

public class HomeFragment extends BaseFragment {

    TextView mTxtLogin,mTxtOpen,mTxtFree;
    ImageView mImgLogo;


    @Override
    public int setFragmentLayoutID() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(View view) {
        mImgLogo=view.findViewById(R.id.img_logo);
        mTxtFree=view.findViewById(R.id.txt_home_free);
        mTxtLogin=view.findViewById(R.id.txt_home_login);
        mTxtOpen=view.findViewById(R.id.txt_home_open);
    }

    @Override
    public void lazyLoadData() {
        super.lazyLoadData();
    }

    @Override
    public void initClick(View view) {
     switch (view.getId()) {
         case R.id.txt_home_free://免费体验

             break;
         case R.id.txt_home_open://立即开户
             break;
         case R.id.txt_home_login://登录
             Intent intent= new Intent(mActivity,LoginActivity.class);
             startActivity(intent);
             break;
         case R.id.img_logo://1ogo
             break;
     }
    }

    @Override
    protected void initListener() {
     mTxtOpen.setOnClickListener(this);
     mTxtLogin.setOnClickListener(this);
     mTxtFree.setOnClickListener(this);
     mImgLogo.setOnClickListener(this);
    }
}
