package com.android.count.terry.operators;

import com.android.count.terry.INode;

/**
 * Created by Terry Wang on 2015/12/13.
 */
public abstract class UniaryOperatorNode implements INode {
    protected final INode mNode;

    public UniaryOperatorNode(INode node){
        mNode = node;
    }
}
