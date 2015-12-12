package com.android.count.terry.numbers;

import com.android.count.terry.INode;

/**
 * Created by Terry Wang on 2015/12/13.
 */
public class NumNode implements INode {

    private int mValue;

    public NumNode(int value){
        mValue = value;
    }

    @Override
    public int evaluate() {
        return mValue;
    }
}
