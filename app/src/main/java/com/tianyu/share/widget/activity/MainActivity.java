package com.tianyu.share.widget.activity;

import android.support.v4.app.Fragment;
import android.view.KeyEvent;

import com.tianyu.share.R;
import com.tianyu.share.base.BaseBottomActivity;
import com.tianyu.share.ui.BottomTabView;
import com.tianyu.share.util.ToastUtils;
import com.tianyu.share.widget.fragment.AllocationFragment;
import com.tianyu.share.widget.fragment.HoldFragment;
import com.tianyu.share.widget.fragment.HomeFragment;
import com.tianyu.share.widget.fragment.MineFragment;
import com.tianyu.share.widget.fragment.TransacteFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseBottomActivity{

    //最后返回时间
    private long lastBackTime = 0;
    //时间间隔
    private static final long TIME_INTERVAL = 2 * 1000;

    @Override
    protected List<BottomTabView.TabItemView> getTabViews() {
        List<BottomTabView.TabItemView> tabItemViews = new ArrayList<>();
        //首页
        tabItemViews.add(new BottomTabView.TabItemView(this,
                getResources().getString(R.string.nagv_home), R.color.colorPrimary,
                R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
        //配资
        tabItemViews.add(new BottomTabView.TabItemView(this,
                getResources().getString(R.string.nagv_allocation), R.color.colorPrimary,
                R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
        //交易
        tabItemViews.add(new BottomTabView.TabItemView(this,
                getResources().getString(R.string.nagv_transaction), R.color.colorPrimary,
                R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
        //持仓
        tabItemViews.add(new BottomTabView.TabItemView(this,
                getResources().getString(R.string.nagv_position), R.color.colorPrimary,
                R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
        //我的
        tabItemViews.add(new BottomTabView.TabItemView(this,
                getResources().getString(R.string.nagv_myself), R.color.colorPrimary,
                R.color.colorAccent, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round));
        return tabItemViews;
    }

    @Override
    protected List<Fragment> getFragments() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new AllocationFragment());
        fragments.add(new TransacteFragment());
        fragments.add(new HoldFragment());
        fragments.add(new MineFragment());
        return fragments;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this instanceof MainActivity) {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                long currentBackTime = System.currentTimeMillis();
                if (currentBackTime - lastBackTime > TIME_INTERVAL) {
                    ToastUtils.showMessage(this,
                            getResources().getString(R.string.press_back));
                    lastBackTime = currentBackTime;
                } else {
                    finish();
                }
                return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
}
