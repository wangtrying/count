package com.android.count.terry.operators.binaryOperators;

import com.android.count.terry.INode;
import com.android.count.terry.operators.BinaryOperatorNode;

/**
 * Created by Terry Wang on 2015/12/13.
 */
public class MultiplyNode extends BinaryOperatorNode {


    public MultiplyNode(INode leftNode, INode rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public int evaluate() {
        return super.mLeftNode.evaluate() * super.mRightNode.evaluate();
    }
}
