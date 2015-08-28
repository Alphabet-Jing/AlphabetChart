package com.alphabet.chartlib.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;

import com.alphabet.chartlib.utils.Utils;

/**
 * Created by alphabet on 15/8/27.
 */
public class LimitLine {
    /**
     * 最大值（ y 值 或者 x 值）
     */
    private float mLimit = 0f;

    private float mLineWidth = 2f;

    private int mLineColor = Color.rgb(237, 91, 91);

    private int mValueTextColor = Color.BLACK;

    private float mTextSize = 13f;

    private Paint.Style mTextStyle = Paint.Style.FILL_AND_STROKE;

    private String mLabel = "";

    private DashPathEffect mDashPathEffect = null;

    private LimitLabelPosition mLabelPosition = LimitLabelPosition.RIGHT_TOP;

    public enum LimitLabelPosition {
        LEFT_TOP, LEFT_BOTTOM, RIGHT_TOP, RIGHT_BOTTOM
    }

    /**
     * @param limit
     */
    public LimitLine(float limit) {
        mLimit = limit;
    }

    /**
     * @param label
     * @param limit
     */
    public LimitLine(String label, float limit) {
        mLabel = label;
        mLimit = limit;
    }


    /**
     * @return
     */
    public float getLineWidth() {
        return mLineWidth;
    }

    /**
     * @param lineWidth
     */
    public void setLineWidth(float lineWidth) {
        if (lineWidth < 0.2f) {
            lineWidth = 0.2f;
        }
        if (lineWidth > 12.0f) {
            lineWidth = 12.0f;
        }
        mLineWidth = Utils.convertDpToPixel(lineWidth);
    }

    public int getLineColor() {
        return mLineColor;
    }

    public void setLineColor(int lineColor) {
        mLineColor = lineColor;
    }

    public void enableDashedLine(float lineLength, float spaceLength, float phase) {
        mDashPathEffect = new DashPathEffect(new float[]{
                lineLength, spaceLength
        }, phase);
    }

    public void disableDashedLine() {
        mDashPathEffect = null;
    }

    public boolean isDashedLineEnable() {
        return mDashPathEffect != null ? true : false;
    }

    public DashPathEffect getDashPathEffect() {
        return mDashPathEffect;
    }

    public void setTextColor(int color) {
        mValueTextColor = color;
    }

    public int getTextColor() {
        return mValueTextColor;
    }

    public void setTextStyle(Paint.Style textStyle) {
        mTextStyle = textStyle;
    }

    public Paint.Style getTextStyle() {
        return mTextStyle;
    }

    public void setLabelPosition(LimitLabelPosition labelPosition) {
        mLabelPosition = labelPosition;
    }

    public LimitLabelPosition getLabelPosition() {
        return mLabelPosition;
    }

    public void setLabel(String label) {
        mLabel = label;
    }

    public String getLabel() {
        return mLabel;
    }

    public void setTextSize(float textSize) {
        mTextSize = Utils.convertDpToPixel(textSize);
    }

    public float getTextSize() {
        return mTextSize;
    }
}
