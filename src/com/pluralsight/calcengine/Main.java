package com.pluralsight.calcengine;

import java.time.LocalDate;
import java.util.Scanner;

/*
 ************************************************************************
 * Note: If you have difficulty building the code, it's probably due to
 *       a difference in the version of the JDK used to create this
 *       project and the JDK version you have installed.
 *
 *       To fix the JDK simply click "OK" on the dialog that appears
 *       when the build fails. This will open a project
 *       configuration dialog. On the project configuration dialog,
 *       select the appropriate JDK version for your setup
 ************************************************************************
 */
public class Main {

    public static void main(String[] args) {

        //performCalculations();
        Divider divider=new Divider();
        doCalculation(divider,100.0d,50.0d);

        Adder adder=new Adder();
        doCalculation(adder,25.0d,92.0d);
        
        performMoreCalculations();
    }

    private static void performMoreCalculations() {
        CalculateBase[] calculations={

                new Divider(100.0d,50.0d),
                new Adder(25.0d,92.0d),
                new Subtracter(225.0d,17.0d),
                new Multiplier(11.0d,3.0d),
        };

        System.out.println();
        System.out.println("Array Calculations");

        for(CalculateBase calculation : calculations){
            calculation.calculate();
            System.out.printf("result =" + calculation.getResult() +"\n");

        }

    }

    static void performCalculations() {

        MathEquation[] equations= new MathEquation[4];
        equations[0]=new MathEquation('d',100.0d,50.0d);
        equations[1]=new MathEquation('a',25.0d,92.0d);
        equations[2]=new MathEquation('s',225.0d,17.0d);
        equations[3]=new MathEquation('m',11.0d,3.0d);

        for(MathEquation equation : equations){
            equation.execute();

            System.out.printf("result = " + equation.result + "\n" );
        }
        System.out.printf("Average result =" + MathEquation.getAverageResult());
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal ){
         calculation.setLeftVal(leftVal);
         calculation.setRightVal(rightVal);
         calculation.calculate();
         System.out.printf("Calculation result =" + calculation.getResult() + "\n");


    }



}



















