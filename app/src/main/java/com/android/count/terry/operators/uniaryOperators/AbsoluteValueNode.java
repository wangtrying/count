package com.android.count.terry.operators.uniaryOperators;

import com.android.count.terry.INode;
import com.android.count.terry.operators.UniaryOperatorNode;

/**
 * Created by Terry Wang on 2015/12/13.
 */
public class AbsoluteValueNode extends UniaryOperatorNode {

    public AbsoluteValueNode(INode node) {
        super(node);
    }

    @Override
    public int evaluate() {
        return Math.abs(super.mNode.evaluate());
    }
}
