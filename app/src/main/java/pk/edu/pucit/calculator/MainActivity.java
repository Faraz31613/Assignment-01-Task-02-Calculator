package pk.edu.pucit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    static int number1=0;
    static int number2=0;
    static boolean AddFlag=false;
    static boolean MinusFlag=false;
    static boolean MultiplyFlag=false;
    static boolean DivideFlag=false;
    static boolean PercentageFlag=false;
    static boolean EqualFlag=false;
    static int num=0; //clicked digit on calculator
    static int num1Counter=0;
    static int num2Counter=0;
    int maxClick=7;
    static  int result=0;
    TextView tv;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv_equation);
        tv1=findViewById(R.id.tv_result);

        View.OnClickListener typeNumberOne = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=1;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener typeNumberTwo = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=2;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener typeNumberThree = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=3;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener typeNumberFour = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=4;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener typeNumberFive = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=5;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener typeNumberSix = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=6;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener typeNumberSeven = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=7;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener typeNumberEight = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=8;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener typeNumberNine = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=9;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener typeNumberZero = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=0;
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    String s =tv.getText().toString();
                    if(num1Counter==0 && Integer.parseInt(tv.getText().toString())==0)
                    {
                        tv.setText(num + "");
                        num1Counter++;
                    }
                    else if(num1Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num1Counter++;
                    }
                    number1=Integer.parseInt(tv.getText().toString());
                }
                else //if(AddFlag==true || MinusFlag==true)
                {
                    String s =tv.getText().toString();
                    if(num2Counter==0)
                    {
                        tv.setText(num + "");
                        num2Counter++;
                    }
                    else if(num2Counter>=10)
                    {
                        tv.setText(s);
                    }
                    else
                    {
                        tv.setText(s + num + "");
                        num2Counter++;
                    }
                    number2=Integer.parseInt(tv.getText().toString());
                }
            }
        };
        View.OnClickListener ClearAC = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1Counter=0;
                tv.setText("00");
            }
        };
        View.OnClickListener Addition = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MinusFlag==false && DivideFlag==false && MultiplyFlag==false && PercentageFlag==false)
                {
                    AddFlag=true;
                    tv.setText(number1 + "+");
                }
            }
        };
        View.OnClickListener Subtraction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AddFlag==false && DivideFlag==false && MultiplyFlag==false && PercentageFlag==false)
                {
                    MinusFlag=true;
                    tv.setText(number1 + "-");
                }
            }
        };
        View.OnClickListener Multiplication = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AddFlag==false && MinusFlag==false && DivideFlag==false && PercentageFlag==false)
                {
                    MultiplyFlag=true;
                    tv.setText(number1 + "*");
                }
            }
        };
        View.OnClickListener Division = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && PercentageFlag==false)
                {
                    DivideFlag=true;
                    tv.setText(number1 + "/");
                }
            }
        };
        View.OnClickListener Percentage = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false)
                {
                    PercentageFlag=true;
                    tv.setText(number1 + "%");
                }
            }
        };

        View.OnClickListener Deletion = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length=tv.getText().toString().length();
                int d =Integer.parseInt(tv.getText().toString());
                if(length>0 && AddFlag==false && MinusFlag==false && MultiplyFlag==false && DivideFlag==false && PercentageFlag==false )
                {
                    if(d==0)
                    {
                        num1Counter=0;
                    }
                    else
                    {
                        num1Counter--;
                    }
                    int d1=d%10;
                    d=d-d1;
                    d=d/10;
                    tv.setText(d + "");
                }
                else{
                    if(d==0)
                    {
                        num2Counter=0;
                    }
                    else
                    {
                        num2Counter--;
                    }
                    int d1=number2%10;
                    number2=number2-d1;
                    number2=number2/10;
                    tv.setText(number2 + "");
                }
            }
        };

        View.OnClickListener EqualTo = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Addition
                if(AddFlag==true && num2Counter!=0) {
                    result = number1 + number2;
                    tv1.setText(result + "");
                    EqualFlag = true;
                    tv.setText("00");
                    AddFlag = false;
                    MinusFlag = false;
                    MultiplyFlag=false;
                    DivideFlag=false;
                    PercentageFlag=false;
                    num1Counter = 0;
                    num2Counter = 0;
                }
                //subtraction
                else if(MinusFlag==true && num2Counter!=0) {
                    result = number1 - number2;
                    tv1.setText(result + "");
                    EqualFlag = true;
                    tv.setText("00");
                    AddFlag = false;
                    MinusFlag = false;
                    MultiplyFlag=false;
                    DivideFlag=false;
                    PercentageFlag=false;
                    num1Counter = 0;
                    num2Counter = 0;
                }
                //Multiplication
                else if(MultiplyFlag==true && num2Counter!=0) {
                    result = number1 * number2;
                    tv1.setText(result + "");
                    EqualFlag = true;
                    tv.setText("00");
                    AddFlag = false;
                    MinusFlag = false;
                    MultiplyFlag=false;
                    DivideFlag=false;
                    PercentageFlag=false;
                    num1Counter = 0;
                    num2Counter = 0;
                }
                //Division
                else if(DivideFlag==true && num2Counter!=0) {
                    result = number1 / number2;
                    tv1.setText(result + "");
                    EqualFlag = true;
                    tv.setText("00");
                    AddFlag = false;
                    MinusFlag = false;
                    MultiplyFlag=false;
                    DivideFlag=false;
                    PercentageFlag=false;
                    num1Counter = 0;
                    num2Counter = 0;
                }
                //Percentage
                else if(PercentageFlag==true && num2Counter!=0) {
                    result = number1 % number2;
                    tv1.setText(result + "");
                    EqualFlag = true;
                    tv.setText("00");
                    AddFlag = false;
                    MinusFlag = false;
                    MultiplyFlag=false;
                    DivideFlag=false;
                    PercentageFlag=false;
                    num1Counter = 0;
                    num2Counter = 0;
                }
                else
                {
                    if(num1Counter!=0)
                    {
                        result = number1;
                    }
                    tv1.setText(result + "");
                    EqualFlag = true;
                    tv.setText("00");
                    AddFlag = false;
                    num1Counter = 0;
                    num2Counter = 0;
                }
            }
        };

        if(num1Counter <= maxClick){
            TextView typeOne = findViewById(R.id.btnOne);
            typeOne.setOnClickListener(typeNumberOne);
            TextView typeTwo = findViewById(R.id.btnTwo);
            typeTwo.setOnClickListener(typeNumberTwo);
            TextView typeThree = findViewById(R.id.btnThree);
            typeThree.setOnClickListener(typeNumberThree);
            TextView typeFour = findViewById(R.id.btnFour);
            typeFour.setOnClickListener(typeNumberFour);
            TextView typeFive = findViewById(R.id.btnFive);
            typeFive.setOnClickListener(typeNumberFive);
            TextView typeSix = findViewById(R.id.btnSix);
            typeSix.setOnClickListener(typeNumberSix);
            TextView typeSeven = findViewById(R.id.btnSeven);
            typeSeven.setOnClickListener(typeNumberSeven);
            TextView typeEight = findViewById(R.id.btnEight);
            typeEight.setOnClickListener(typeNumberEight);
            TextView typeNine = findViewById(R.id.btnNine);
            typeNine.setOnClickListener(typeNumberNine);
            TextView typeZero = findViewById(R.id.btnZero);
            typeZero.setOnClickListener(typeNumberZero);
        }
        TextView typeAC = findViewById(R.id.btnClearAC);
        typeAC.setOnClickListener(ClearAC);

        TextView Add = findViewById(R.id.btnPlus);
        Add.setOnClickListener(Addition);

        TextView Minus = findViewById(R.id.btnMinus);
        Minus.setOnClickListener(Subtraction);

        TextView Multiply = findViewById(R.id.btnMultiply);
        Multiply.setOnClickListener(Multiplication);

        TextView Divide = findViewById(R.id.btnDivide);
        Divide.setOnClickListener(Division);

        TextView Percent = findViewById(R.id.btnPercentage);
        Percent.setOnClickListener(Percentage);

        TextView del = findViewById(R.id.btnDelete);
        del.setOnClickListener(Deletion);

        TextView Equal = findViewById(R.id.btnEqual);
        Equal.setOnClickListener(EqualTo);

    }
}
