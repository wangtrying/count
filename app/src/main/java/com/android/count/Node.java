package com.android.count;

import android.util.Log;

/**
 * Created by Hiiir on 2015/12/11.
 */
public class Node {

    private String operator;
    private int operand;
    private Node leftNode;
    private Node rightNode;
    private boolean isOperator;

    public Node(String operator){
        this.operator = operator;
        isOperator = true;
    }

    public Node(int operand){
        this.operand = operand;
        isOperator = false;
    }

    public void setLeftNode(Node node){
        leftNode = node;
    }

    public void setRightNode(Node node){
        rightNode = node;
    }

    public int evaluate(){

        if ( leftNode.isOperator()  ) {

            leftNode.evaluate();
        }
        if ( rightNode.isOperator() ){

            rightNode.evaluate();
        }

        switch (operator){
            case "+":
                operand = leftNode.getValue() + rightNode.getValue();
                break;

            case "-":
                operand = leftNode.getValue() - rightNode.getValue();
                break;

            case "*":
                operand =  leftNode.getValue() * rightNode.getValue();
                break;

            case "/":
                operand = leftNode.getValue() / rightNode.getValue();
                break;

            default:
                operand = -1;
                break;
        }

        return operand;

    }

    public int getValue(){

        return operand;
    }

    public boolean isOperator(){
        return isOperator;
    }
}
