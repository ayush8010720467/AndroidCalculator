package com.example.ayush.calculater;

import android.util.Log;

/**
 * Created by Ayush on 28-Oct-17.
 */

public class SolveExpression {
    private static final String TAG="Digits_Read";
    private String expression;
    private String result;
    SolveExpression(String expression)
    {
        this.expression=expression;
    }
    public String  solveExpression()
    {
        int no=0;
        float res=0;
        int numberStack[]=new int [50];
        char operatorStack[]=new char[25];
        int k=0,l=0;
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i)!='+'&&expression.charAt(i)!='-'&&expression.charAt(i)!='*'&&expression.charAt(i)!='/')
            {
                no=no*10+((int)expression.charAt(i)-48);

            }
            else
            {
                Log.d(TAG,"the value of the digit is"+expression.length());
                numberStack[k++]=no;
                no=0;
                operatorStack[l++]=expression.charAt(i);
            }
        }
        numberStack[k++]=no;
        res=numberStack[0];
        for(int i=0;i<l;i++)
        {
            if(operatorStack[i]=='+')
            {

                // operation of addition is to be performed in this area
                res+=numberStack[i+1];

            }
            if(operatorStack[i]=='-')
            {
                // operation of subtraction  is to be performed in this area
                res-=numberStack[i+1];
            }
            if(operatorStack[i]=='*')
            {
                // operation of multiplication is to be performed in this area
                res*=numberStack[i+1];
            }
            if(operatorStack[i]=='/')
            {
                // operation of division is to be performed in this area
                res/=numberStack[i+1];

            }
        }
        result=String.valueOf(res);
        return result;
    }
}
