package com.tianyu.share.common;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;

/**
 * Created by lenovo on 2018/6/15.
 */

public class APP extends Application {
    private static APP mApp = null;
    protected static int mainThreadId;
    protected static Handler handler;

    public static APP getInstance() {
        return mApp;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        mainThreadId = android.os.Process.myTid();
        handler = new Handler();
        // 在这里为应用设置异常处理程序，然后我们的程序才能捕获未处理的异常
        CrashHandler crashHandler = CrashHandler.getInstance();
        mApp=this;
        crashHandler.init(this);
        initTextSize();

    }


    /**
     * 获取全局handler
     *
     * @return 全局handler
     */
    public static Handler getHandler() {
        return handler;
    }


    /**
     * 获取主线程id
     *
     * @return 主线程id
     */
    public static int getMainThreadId() {
        return mainThreadId;
    }

    /**
     * 使其系统更改字体大小无效
     */
    private void initTextSize() {
        Resources res = getResources();
        Configuration config = new Configuration();
        config.setToDefaults();
        res.updateConfiguration(config, res.getDisplayMetrics());
    }

    /**
     * 获取Application的Context
     **/
    public static Context getAppContext() {
        if (mApp == null)
            return null;
        return mApp.getApplicationContext();
    }
}
