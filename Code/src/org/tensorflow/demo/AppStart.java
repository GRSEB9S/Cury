package org.tensorflow.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/**
 * Created by 进波 on 2017/12/1.
 */

public class AppStart extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = View.inflate(this,R.layout.app_start,null);
        setContentView(view);

        AlphaAnimation aa = new AlphaAnimation(0.5f,1.0f);
        aa.setDuration(800);
        view.setAnimation(aa);
        aa.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                redirectTo();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

    private void redirectTo() {
        Intent intent = new Intent(this,DetectorActivity.class);
        startActivity(intent);
        finish();
    }

}
