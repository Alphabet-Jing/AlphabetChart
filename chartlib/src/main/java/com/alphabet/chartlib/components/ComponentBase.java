package com.alphabet.chartlib.components;

import android.graphics.Color;
import android.graphics.Typeface;

import com.alphabet.chartlib.utils.Utils;

/**
 * 通用组件类（坐标轴，印章等）
 *
 * Created by alphabet on 15/8/27.
 */
public abstract class ComponentBase {

    /**
     * 标志是否可用
     */
    protected boolean mEnable = true;

    /**
     * x 轴偏移量
     */
    protected float mXOffset = 5f;

    /**
     * y 轴偏移量
     */
    protected float mYOffset = 5f;

    /**
     * 标注使用的字体
     */
    protected Typeface mTypeface = null;

    /**
     * 标注文字大小
     */
    protected float mTextSize = 10f;

    /**
     * 标注文字颜色
     */
    protected int mTextColor = Color.BLACK;

    public ComponentBase() {
    }

    public boolean isEnable() {
        return mEnable;
    }

    public void setEnable(boolean enable) {
        mEnable = enable;
    }

    public float getXOffset() {
        return mXOffset;
    }

    public void setXOffset(float xOffset) {
        mXOffset = Utils.convertDpToPixel(xOffset);
    }

    public float getYOffset() {
        return mYOffset;
    }

    public void setYOffset(float yOffset) {
        mYOffset = Utils.convertDpToPixel(yOffset);
    }

    public Typeface getTypeface() {
        return mTypeface;
    }

    public void setTypeface(Typeface typeface) {
        mTypeface = typeface;
    }

    public float getTextSize() {
        return mTextSize;
    }

    public void setTextSize(float textSize) {
        if (textSize > 24f){
            textSize = 24f;
        }
        if (textSize < 6f){
            textSize = 6f;
        }

        mTextSize = Utils.convertDpToPixel(textSize);
    }

    public int getTextColor() {
        return mTextColor;
    }

    public void setTextColor(int textColor) {
        mTextColor = textColor;
    }
}
