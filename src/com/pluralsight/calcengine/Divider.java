package com.pluralsight.calcengine;

public class Divider extends CalculateBase{

    //Constructors
    public Divider(){}

    public Divider(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }
    @Override
    public void calculate(){
        double value=getLeftVal()/getRightVal();
        setResult(value);
    }
}
