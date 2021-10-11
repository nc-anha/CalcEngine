package com.pluralsight.calcengine;

public class Adder extends CalculateBase {

    //Constructors
    public Adder(){}

    public Adder(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate(){
        double value=getLeftVal()+getRightVal();
        setResult(value);
    }
}
