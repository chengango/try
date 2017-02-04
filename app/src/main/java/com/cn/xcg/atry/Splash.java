package com.cn.xcg.atry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by xuche on 2017/1/28.
 */

public class Splash extends Activity {

    private final int SPLASH_DISPLAY_LENGHT = 3000; //延迟三秒

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash.this,SampleActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }

        }, SPLASH_DISPLAY_LENGHT);
    }
}