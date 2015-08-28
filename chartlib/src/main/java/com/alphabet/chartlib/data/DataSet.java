package com.alphabet.chartlib.data;

import android.graphics.Color;
import android.graphics.Typeface;

import com.alphabet.chartlib.utils.ValueFormatter;

import java.util.List;

/**
 * Created by alphabet on 15/8/27.
 */
public abstract class DataSet<T extends Entry>{

    /**
     * 对应色彩集
     */
    protected List<Integer> mColors = null;

    /**
     * 对应数据集
     */
    protected List<T> mYVals = null;

    /**
     * 最大 y 轴值
     */
    protected float mYMax = 0.0f;

    /**
     * 最小 y 轴值
     */
    protected float mYMin = 0.0f;

    /**
     * y 轴值总和
     */
    protected float mYValueSum = 0f;

    /**
     * 计算区间大小值的开始位置
     */
    protected int mLastStart = 0;

    /**
     * 计算区间大小值的结束位置
     */
    protected int mLastEnd = 0;

    /**
     * 数据集标签，描述当前数据集
     */
    protected String mLabel = "DataSet";

    /**
     * 可见性标志
     */
    protected boolean mVisible = true;

    /**
     * 是否绘制 y 值
     */
    protected boolean mDrawValues = true;

    /**
     * 描述 y 值的文字颜色
     */
    protected int mValueColor = Color.BLACK;

    /**
     * 描述 y 值的文字大小
     */
    protected float mValueTextSize = 17f;

    /**
     * 文字字体
     */
    protected Typeface mValueTypeface;

    /**
     * 格式化数据和文字
     */
    protected transient ValueFormatter mValueFormatter;

    // FIXME: 15/8/27 
}
