package com.bozlun.health.android.activity.wylactivity.wyl_util.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.bozlun.health.android.bleutil.MyCommandManager;

/**
 * Created by admin on 2017/2/13.
 * 监听当前的语言变化（发送广播）
 */

public class LocaleChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        try {
            if (intent.getAction().equals(Intent.ACTION_LOCALE_CHANGED)) {
                String language = context.getResources().getConfiguration().locale.getLanguage();
                //中文

            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }
}
