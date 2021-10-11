package com.pluralsight.calcengine;

public class Subtracter extends CalculateBase{

    //Constructors
    public Subtracter(){}

    public Subtracter(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate(){
        double value=getLeftVal()-getRightVal();
        setResult(value);
    }
}
