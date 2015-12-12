package com.android.count.terry.operators;

import com.android.count.terry.INode;

/**
 * Created by Terry Wang on 2015/12/13.
 */
public abstract class UnitaryOperatorNode implements INode {
    protected final INode mNode;

    public UnitaryOperatorNode(INode node){
        mNode = node;
    }
}
