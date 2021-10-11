package com.pluralsight.calcengine;

public class MathEquation {

    double leftVal;
    double rightVal;
    char opCode;
    double result;

    //Static members
    private static int numberOfCalculations;
    private static double sumOfResults;

    //Constructors
    public MathEquation(){}
    public MathEquation(char opCode){

        this.opCode=opCode;
    }

    public MathEquation(char opCode, double leftVal,double rightVal){
        this(opCode);
        this.leftVal=leftVal;
        this.rightVal=rightVal;
    }

    //Function performing calculations
    void execute(){
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }

        numberOfCalculations++;
        sumOfResults+=result;

    }

    public static double getAverageResult(){
        return sumOfResults / numberOfCalculations;

    }
}
