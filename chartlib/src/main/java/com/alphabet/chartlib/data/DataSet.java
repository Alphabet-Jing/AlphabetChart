package com.alphabet.chartlib.data;

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
}
