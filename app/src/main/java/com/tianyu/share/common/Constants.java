package com.tianyu.share.common;

import android.os.Environment;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by Silence on 2018/3/20.
 */

public class Constants {

    /**
     * 异常日志路径
     */
    public static final String LOG_PATH = Environment
            .getExternalStorageDirectory().getPath() + File.separator + "share" + File.separator
            + "log" + File.separator;
    /**
     * 截图路径
     */
    public static final String SCREEN_SHOT_PATH = Environment
            .getExternalStorageDirectory().getPath() + File.separator + "share" + File.separator
            + "screen" + File.separator;
    /**
     * 截图名称
     */
    public static final String SCREEN_SHOT_IMAGE = "screenShot.png";
    /**
     * 图片路径
     */
    public static final String IMAGE_PATH = Environment
            .getExternalStorageDirectory().getPath() + File.separator + "share" + File.separator
            + "Image" + File.separator;
    /**
     * 图片路径
     */
    public static final String IMAGE_SDCARD_PATH = "share/Image";
    /**
     * 保存Assets图片到SD卡路径
     */
    public static final String ASSETS_IMAGE_PATH = Environment
            .getExternalStorageDirectory().getPath() + File.separator + "share" + File.separator
            + "Image" + File.separator+ "icon_shopping.png";

    /**
     * 头像路径
     */
    public static final String HEAD_PIC_PATH = Environment
            .getExternalStorageDirectory().getPath() + File.separator + "share" + File.separator
            + "user" + File.separator;
    /**
     * 录制音频路径
     */
    public static final String RECORD_AUDIO_STREAM_PATH = Environment
            .getExternalStorageDirectory().getPath() + File.separator + "share" + File.separator
            + "audio" + File.separator;
    /**
     * 频道路径
     */
    public static final String CHANNEL_PIC_PATH = Environment
            .getExternalStorageDirectory().getPath() + File.separator + "share" + File.separator
            + "channel" + File.separator;
    /**
     * 用户头像名称
     */
    public static final String USER_PIC_NAME = Constants.HEAD_PIC_PATH
            + "head.png";

    /**
     * 第一次进入应用
     */
    public static final String FIRST_INTO_APP = "FIRST";
    /**
     * 手机号码
     */
    public static final String USER_TELL = "USER_TELL";
    /**
     * 密码
     */
    public static final String USER_PASS = "USER_PASS";
    /**
     * 用户名
     */
    public static final String USER_NAME = "USER_NAME";
    /**
     * 昵称
     */
    public static final String NICK_NAME = "NICK_NAME";
    /**
     * 运行时权限请求码
     */
    public static final int PER_REQUEST_CODE = 0x01;
    /**
     * 保存到相册
     */
    public static final int DIALOG_SAVE_ALBUM = 0x02;
    /**
     * 拍照标记
     */
    public static final int TAKE_PHOTO_FLAG = 0X001;
    /**
     * 选取照片标记
     */
    public static final int CHOSE_PHOTO_FLAG = 0X002;
    /**
     * 裁剪照片标记
     */
    public static final int CROP_PHOTO_FLAG = 0X003;
    /**
     * 7.0拍照标记
     */
    public static final int PHONE_CAMERA = 0X004;
    /**
     * 7.0裁剪标记
     */
    public static final int PHONE_CROP = 0X005;

    /**
     * 设置Banner翻页时间
     */
    public static final long DELAY_TIME = 5000;

    /**
     * 7.0更新照片标记
     */
    public static final String UPDATE_PHOTO_FLAG = "UPDATE_PHOTO_FLAG";
    /**
     * 更新照片标记
     */
    public static final String UPDATE_PHOTO = "UPDATE_PHOTO";
    /**
     * AppId
     **/
    public static String APPID = "10101";
    /**
     * 缓存路径
     */
    public static final String CACHE_FILE_PATH = Environment
            .getExternalStorageDirectory().getPath() + "/share/pdf/";
    /**
     * AppSecret
     **/
    public static String APP_SECRET = "afd55f877bad4aaeab45fb4ca567d234";
    /**
     * BASE_URL
     **/
    public static String BASE_URL = "";

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"data\": 1468993603787,\n" +
                "    \"code\": 100010104,\n" +
                "    \"msg\": \"timestamp过期\"\n" +
                "}";

        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, String>>() {
        }.getType();
        Map ss = gson.fromJson(json, type);
        System.out.println(ss);
    }


}
