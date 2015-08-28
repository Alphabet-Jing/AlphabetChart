package com.alphabet.chartlib.components;

import android.graphics.Paint;

import com.alphabet.chartlib.utils.Utils;
import com.alphabet.chartlib.utils.ValueFormatter;

/**
 * Created by alphabet on 15/8/27.
 */
public class YAxis extends AxisBase {

    protected ValueFormatter mValueFormatter;

    /**
     * 实际的条目值
     */
    public float[] mEntries = new float[]{};

    /**
     * 总数
     */
    public int mEntryCount;

    /**
     * 小数位数
     */
    public int mDecimals;

    /**
     * 标注数量
     */
    private int mLabelCount = 6;

    /**
     * 是否绘制最高点的条目
     */
    private boolean mDrawTopLabelEntry = true;

    /**
     * 是否只显示 y 标注的最大与最小值
     */
    protected boolean mShowOnlyMinMax = false;

    /**
     * 是否被转换完成
     */
    protected boolean mInverted = false;

    /**
     * 标记是否从零开始
     */
    protected boolean mStartAtZero = true;

    /**
     * 
     */
    // FIXME: 15/8/27 mean
    protected boolean mForceLabels = false;

    protected float mCustomAxisMin = Float.NaN;

    protected float mCustomAxisMax = Float.NaN;

    protected float mSpacePercentTop = 10f;

    protected float mSpacePercentBottom = 10f;

    public float mAxisMaximum = 0f;

    public float mAxisMinimum = 0f;

    /**
     * 坐标轴的范围
     */
    public float mAxisRange = 0f;

    protected YAxisLabelPosition mPosition = YAxisLabelPosition.OUTSIDE_CHART;

    public enum YAxisLabelPosition{
        OUTSIDE_CHART,INSIDE_CHART
    }

    private AxisDependency mAxisDependency;

    public enum AxisDependency {
        LEFT,RIGHT
    }

    public YAxis() {
        super();
        mAxisDependency = AxisDependency.LEFT;
        mYOffset = 0f;
    }

    public YAxis(AxisDependency position) {
        super();
        mAxisDependency = position;
        mYOffset = 0f;
    }

    @Override
    public String getLongestLabel() {
        return null;
    }

    public AxisDependency getAxisDependency() {
        return mAxisDependency;
    }

    public YAxisLabelPosition getLabelPosition(){
        return mPosition;
    }

    public void setPosition(YAxisLabelPosition position) {
        mPosition = position;
    }

    public boolean isDrawTopLabelEntryEnabled() {
        return mDrawTopLabelEntry;
    }

    public void setDrawTopLabelEntry(boolean enable) {
        mDrawTopLabelEntry = enable;
    }

    public void setLabelCount(int labelCount,boolean force) {
        if (labelCount > 25){
            labelCount = 25;
        }
        if (labelCount < 2){
            labelCount = 2;
        }

        mLabelCount = labelCount;
        mForceLabels = force;
    }

    public int getLabelCount() {
        return mLabelCount;
    }

    public boolean isForceLabelsEnabled() {
        return mForceLabels;
    }

    public void setShowOnlyMinMax(boolean enabled) {
        mShowOnlyMinMax = enabled;
    }

    public boolean isShowOnlyMinMaxEnabled() {
        return mShowOnlyMinMax;
    }

    public void setInverted(boolean enabled) {
        mInverted = enabled;
    }

    public boolean isInverted() {
        return mInverted;
    }

    public void setStartAtZero(boolean enabled) {
        mStartAtZero = enabled;
    }

    public boolean isStartAtZeroEnabled() {
        return mStartAtZero;
    }

    public float getAxisMinValue(){
        return mCustomAxisMin;
    }

    public void setAxisMinValue(float min){
        mCustomAxisMin = min;
    }

    public void resetAxisMinValue(){
        mCustomAxisMin = Float.NaN;
    }

    public void setSpaceTop(float percent){
        mSpacePercentTop = percent;
    }

    public float getSpaceTop(){
        return mSpacePercentTop;
    }

    public void setSpaceBottom(float percent){
        mSpacePercentBottom = percent;
    }

    public float getSpaceBottom(){
        return mSpacePercentBottom;
    }

    public float getRequiredWidthSpace(Paint p){
        p.setTextSize(mTextSize);

        String label = getLongestLabel();
        return Utils.calcTextWidth(p,label);
    }

    public float getRequiredHeightSpace(Paint p){
        p.setTextSize(mTextSize);

        String label = getLongestLabel();
        return Utils.calcTextHeight(p,label);
    }


}
