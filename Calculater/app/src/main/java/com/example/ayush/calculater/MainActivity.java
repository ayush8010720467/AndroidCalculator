package com.example.ayush.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mOne;
    private Button mTwo;
    private Button mThree;
    private Button mFour;
    private Button mFive;
    private Button mSix;
    private Button mSeven;
    private Button mEight;
    private Button mNine;
    private Button mZero;
    private ImageButton mBackspace;
    private Button mPlus;
    private Button mMinus;
    private Button mMultiply;
    private Button mDivide;
    private Button mEqual;
    private TextView mExpressionTextView;
    private TextView mExpressionResultTextView;
    private String mExpression="";
    private String mResult="";
    private String KEY_RESULT="result";
    private String KEY_EXPRESSION="expression";
    private String BUFFER="bufferExpression";
    private String KEY_PRESSED="keyPressed";
    private String mExpressionBuffer="";
    private boolean mIsNumberClicked=false;
    private void updateExpressionResultTextView()
    {
        mExpressionResultTextView.setText(mResult);
    }
    private void updateExpressionTextView()
    {
        mExpressionTextView.setText(mExpression);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mExpressionResultTextView=(TextView)findViewById(R.id.expression_result);
        mExpressionTextView=(TextView)findViewById(R.id.expression);
        updateExpressionTextView();
        if(savedInstanceState!=null)
        {
            mResult=savedInstanceState.getString(KEY_RESULT);
            mExpression=savedInstanceState.getString(KEY_EXPRESSION);
            mExpressionBuffer=savedInstanceState.getString(BUFFER);
            mIsNumberClicked=savedInstanceState.getBoolean(KEY_PRESSED);
            if(mResult!="")
                updateExpressionResultTextView();
            if(mExpressionBuffer!="")
                mExpressionTextView.setText(mExpressionBuffer);

        }

        mZero=(Button)findViewById(R.id.zero);
        //code for what is to be done when zero is pressed
        mZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="0";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });

        mOne=(Button)findViewById(R.id.one);
        //code for what is to be done when one is pressed
        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="1";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });
        mTwo=(Button)findViewById(R.id.two);
        //code for what is to be done when two is pressed
        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="2";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });
        mThree=(Button)findViewById(R.id.three);
        //code for what is to be done when three is pressed
        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="3";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });
        mFour=(Button)findViewById(R.id.four);
        //code for what is to be done when four is pressed
        mFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="4";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });
        mFive=(Button)findViewById(R.id.five);
        //code for what is to be done when five is pressed
        mFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="5";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });
        mSix=(Button)findViewById(R.id.six);
        //code for what is to be done when six is pressed
        mSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="6";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });

        mSeven=(Button)findViewById(R.id.seven);
        //code for what is to be done when seven is pressed
        mSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="7";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });

        mEight=(Button)findViewById(R.id.eight);
        //code for what is to be done when eight is pressed
        mEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="8";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });

        mNine=(Button)findViewById(R.id.nine);
        //code for what is to be done when nine is pressed
        mNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsNumberClicked=true;
                mExpression+="9";
                mExpressionBuffer=mExpression;
                updateExpressionTextView();
            }
        });
        mBackspace=(ImageButton)findViewById(R.id.backspace);
        //code for what is to be done when backspace is pressed
        mBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mExpression.length()>0) {
                    mExpression = mExpression.substring(0, mExpression.length() - 1);

                    if(mExpression.length()>0)
                    if(mExpression.charAt(mExpression.length()-1)>=48&&mExpression.charAt(mExpression.length()-1)<=57)
                    {
                        mIsNumberClicked=true;
                    }
                    else
                        mIsNumberClicked=false;
                    if(mExpression=="")
                        mIsNumberClicked=false;
                    mExpressionBuffer=mExpression;
                    updateExpressionTextView();
                }
            }
        });
        mPlus=(Button)findViewById(R.id.plus);
        //code for what is to be done when plus is pressed
        mPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIsNumberClicked==true||mExpression=="")
                {

                    mExpression+="+";
                    mExpressionBuffer=mExpression;
                    updateExpressionTextView();
                    mIsNumberClicked=false;
                }
            }
        });

        mMinus=(Button)findViewById(R.id.minus);
        //code for what is to be done when minus is pressed
        mMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIsNumberClicked==true||mExpression=="") {
                    mExpression += "-";
                    mExpressionBuffer=mExpression;
                    updateExpressionTextView();
                    mIsNumberClicked=false;
                }
            }
        });

        mMultiply=(Button)findViewById(R.id.multiply);
        //code for what is to be done when multiply is pressed
        mMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIsNumberClicked==true)
                {
                    mExpression+="*";
                    mExpressionBuffer=mExpression;
                    updateExpressionTextView();
                    mIsNumberClicked=false;

                }
            }
        });

        mDivide=(Button)findViewById(R.id.div);
        //code for what is to be done when div  is pressed
        mDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIsNumberClicked==true)
                {

                    mExpression+="/";
                    mExpressionBuffer=mExpression;
                    updateExpressionTextView();
                    mIsNumberClicked=false;
                }
            }
        });

        mEqual=(Button)findViewById(R.id.equal);
        //code for what is to be done when equal is pressed
        mEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mIsNumberClicked==true)
                {
                    SolveExpression solution=new SolveExpression(mExpression);
                    mResult=solution.solveExpression();
                    mExpression+="=";
                    mExpressionBuffer=mExpression;
                    updateExpressionTextView();
                    mExpression="";
                    updateExpressionResultTextView();
                    mIsNumberClicked=false;
                }
            }
        });
    }
    @Override
    public void onSaveInstanceState(Bundle saveInstanceState)
    {
            super.onSaveInstanceState(saveInstanceState);
            saveInstanceState.putString(KEY_RESULT,mResult);
            saveInstanceState.putString(KEY_EXPRESSION,mExpression);
            saveInstanceState.putBoolean(KEY_PRESSED,mIsNumberClicked);
            saveInstanceState.putString(BUFFER,mExpressionBuffer);

    }
}
