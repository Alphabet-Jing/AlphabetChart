package com.alphabet.chartlib.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.util.Log;

import com.alphabet.chartlib.utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alphabet on 15/8/27.
 */
public abstract class AxisBase extends ComponentBase {

    private static final String TAG = AxisBase.class.getSimpleName();

    protected int mGridColor = Color.GRAY;

    protected float mGridLineWidth = 1f;

    protected int mAxisLineColor = Color.GRAY;

    protected float mAxisLineWidth = 1f;

    protected boolean mDrawGridLines = true;

    protected boolean mDrawAxisLine = true;

    protected boolean mDrawLabels = true;

    protected DashPathEffect mGridDashPathEffect = null;

    protected List<LimitLine> mLimitLines = null;

    protected boolean mDrawLimitLineBehindData = false;

    public AxisBase() {
        mTextSize = Utils.convertDpToPixel(10f);
        mXOffset = Utils.convertDpToPixel(5f);
        mYOffset = Utils.convertDpToPixel(5f);
        mLimitLines = new ArrayList<>();
    }

    public boolean isDrawGridLinesEnabled() {
        return mDrawGridLines;
    }

    public void setDrawGridLines(boolean enable) {
        mDrawGridLines = enable;
    }

    public boolean isDrawAxisLineEnabled() {
        return mDrawAxisLine;
    }

    public void setDrawAxisLine(boolean enable) {
        mDrawAxisLine = enable;
    }

    public void setGridColor(int gridColor) {
        mGridColor = gridColor;
    }

    public int getGridColor() {
        return mGridColor;
    }

    public void setAxisLineWidth(float axisLineWidth) {
        mAxisLineWidth = axisLineWidth;
    }

    public float getAxisLineWidth() {
        return mAxisLineWidth;
    }

    public void setGridLineWidth(float gridLineWidth) {
        mGridLineWidth = Utils.convertDpToPixel(gridLineWidth);
    }

    public float getGridLineWidth() {
        return mGridLineWidth;
    }

    public void setAxisLineColor(int axisLineColor) {
        mAxisLineColor = axisLineColor;
    }

    public int getAxisLineColor() {
        return mAxisLineColor;
    }

    public void setDrawLabels(boolean enable) {
        mDrawLabels = enable;
    }

    public boolean isDrawLabelsEnabled() {
        return mDrawLabels;
    }

    public void addLimitLine(LimitLine l) {
        mLimitLines.add(l);
        if (mLimitLines.size() > 6) {
            Log.d(TAG, "addLimitLine more than 6! Alright?");
        }
    }

    public void removeLimitLine(LimitLine l) {
        mLimitLines.remove(l);
    }

    public void removeAllLimitLines() {
        mLimitLines.clear();
    }

    public List<LimitLine> getLimitLines() {
        return mLimitLines;
    }

    public void setDrawLimitLineBehindData(boolean enable) {
        mDrawLimitLineBehindData = enable;
    }

    public boolean isDrawLimitLineBehindDataEnabled() {
        return mDrawLimitLineBehindData;
    }

    public abstract String getLongestLabel();

    public void enableGridDashedLine(float lineLength, float spaceLength, float phase) {
        mGridDashPathEffect = new DashPathEffect(new float[]{
                lineLength, spaceLength
        }, phase);
    }

    public void disableGridDashedLine() {
        mGridDashPathEffect = null;
    }

    public boolean isGridDashedLineEnabled() {
        return mGridDashPathEffect != null ? true : false;
    }

    public DashPathEffect getGridDashPathEffect() {
        return mGridDashPathEffect;
    }

    // FIXME: 15/8/28 未完成
}
