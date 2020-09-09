package com.lesehankoding.splashtouch;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.View;

public class SplashTouch {
    public static void splashColor(View view, int fromColor, int toColor){
        ObjectAnimator colorFade = ObjectAnimator.ofObject(
                view, "backgroundColor" /*view attribute name*/,
                new ArgbEvaluator(),
                fromColor /*from color*/,
                toColor  /*to color*/);
                colorFade.setDuration(1000);
                colorFade.setStartDelay(500);
                colorFade.start();
    }
}
