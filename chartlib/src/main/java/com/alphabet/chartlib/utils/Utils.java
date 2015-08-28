package com.alphabet.chartlib.utils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;

/**
 * Created by alphabet on 15/8/27.
 */
public class Utils {

    private static final String TAG = Utils.class.getSimpleName();

    private static DisplayMetrics sDisplayMetrics;

    public static void init(Context context){
        if (context == null){
            Log.e(TAG, "init failed,context is null!");
        } else {
            sDisplayMetrics = context.getResources().getDisplayMetrics();
        }
    }

    public static float convertDpToPixel(float dp){
        if (sDisplayMetrics == null){
            Log.e(TAG, "convertDptoPixel failed. You need to call Utils.init(...)");
            return dp;
        }else {
            DisplayMetrics metrics = sDisplayMetrics;
            float px = dp * (metrics.densityDpi / 160f);
            return px;
        }
    }

    public static float converPixelToDp(float px){
        if (sDisplayMetrics == null){
            Log.e(TAG, "converPixelToDp failed. You need to call Utils.init(...)");
            return px;
        }else {
            DisplayMetrics metrics = sDisplayMetrics;
            float dp = px / (metrics.densityDpi / 160f);
            return dp;
        }
    }

    public static int calcTextWidth(Paint paint , String text){
        return (int) paint.measureText(text);
    }

    public static int calcTextHeight(Paint paint , String text){
        Rect rect = new Rect();
        paint.getTextBounds(text,0,text.length(),rect);
        return rect.height();
    }
}
