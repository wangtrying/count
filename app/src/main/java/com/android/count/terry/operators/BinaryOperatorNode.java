package com.android.count.terry.operators;

import com.android.count.terry.INode;

/**
 * Created by Terry Wang on 2015/12/13.
 */
public abstract class BinaryOperatorNode implements INode {

    protected INode mLeftNode;
    protected INode mRightNode;

    public BinaryOperatorNode(INode leftNode, INode rightNode){
        mLeftNode = leftNode;
        mRightNode = rightNode;
    }
}
