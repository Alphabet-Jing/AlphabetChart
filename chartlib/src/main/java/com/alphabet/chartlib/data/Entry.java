package com.alphabet.chartlib.data;

/**
 * Created by alphabet on 15/8/27. Learn from Philipp Jahoda
 *
 * 基本的数据条目
 */
public class Entry {

    /**
     * 实际值
     */
    private float mVal = 0f;

    /**
     * 数据在 x 轴位置
     */
    private int mXIndex = 0;

    /**
     * 附加数据，可选用
     */
    private Object mData = null;

    /**
     * 判断数据是否相同的精确度
     */
    private final static float PRECISION = 0.00001f;


    /**
     * 图形中的单个条目
     * @param val 实际值（在坐标系中指示 y 值）
     * @param xIndex 位置值（坐标系中指示 x 值，不可超过 x 数组的最大值）
     *
     */
    public Entry(float val, int xIndex) {
        mVal = val;
        mXIndex = xIndex;
    }

    /**
     * 图形中的单个条目
     * @param val 实际值（在坐标系中指示 y 值）
     * @param xIndex 位置值（坐标系中指示 x 值，不可超过 x 数组的最大值）
     * @param data 附加数据，可选
     *
     */
    public Entry(float val, int xIndex, Object data) {
        this(val,xIndex);
        mData = data;
    }

    /**
     * 获取真实值
     *
     * @return
     */
    public float getVal() {
        return mVal;
    }

    /**
     * 设置真实值
     *
     * @param val
     */
    public void setVal(float val) {
        mVal = val;
    }

    /**
     * 获取位置值
     *
     * @return
     */
    public int getXIndex() {
        return mXIndex;
    }

    /**
     * 设置位置值
     *
     * @param XIndex
     */
    public void setXIndex(int XIndex) {
        mXIndex = XIndex;
    }

    /**
     * 获取附加数据
     *
     * @return
     */
    public Object getData() {
        return mData;
    }

    /**
     * 设置附加值
     *
     * @param data
     */
    public void setData(Object data) {
        mData = data;
    }

    /**
     * 获取条目的拷贝
     *
     * @return
     */
    public Entry copy(){
        return new Entry(mVal,mXIndex,mData);
    }

    public boolean equalTo(Entry e){
        if (e == null){
            return false;
        }

        if (e.getData() != mData){
            return false;
        }

        if (e.getXIndex() != mXIndex){
            return false;
        }

        if (Math.abs(e.getVal() - mVal) > PRECISION){
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format("Entry,xIndex:%f value(sum):%d",getXIndex(),getVal());
    }
}
