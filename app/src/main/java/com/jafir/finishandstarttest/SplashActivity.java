package com.jafir.finishandstarttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;

/**
 * Created by jafir on 2018/1/15.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);


                /**
                 * please change the order of finish and startActivity to test
                 *
                 * intent to Main
                 * then click back key to close APP
                 * open the recent task by clicking the switch key of phone
                 * choose the APP
                 * it will open Main directly
                 * instead of Splash
                 *
                 */
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }.sendEmptyMessageDelayed(1, 3000);
    }
}
