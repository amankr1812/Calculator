package com.example.amank.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button add,sub,mul,div,submit;
    String n1,n2;

    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         num1=(EditText)findViewById(R.id.num1);
         num2=(EditText)findViewById(R.id.num2);


        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                n1=num1.getText().toString().trim();
                n2=num2.getText().toString().trim();
                a=new Integer(n1);
                b=new Integer(n2);
                int x=a+b;

                Toast.makeText(MainActivity.this, "ans = "+x, Toast.LENGTH_SHORT).show();



            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                n1=num1.getText().toString().trim();
                n2=num2.getText().toString().trim();
                a=new Integer(n1);
                b=new Integer(n2);
                int x=a*b;

                Toast.makeText(MainActivity.this, "ans = "+x, Toast.LENGTH_SHORT).show();

               }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=num1.getText().toString().trim();
                n2=num2.getText().toString().trim();
                a=new Integer(n1);
                b=new Integer(n2);
                int x=a-b;

                Toast.makeText(MainActivity.this, "ans = "+x, Toast.LENGTH_SHORT).show();


            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=num1.getText().toString().trim();
                n2=num2.getText().toString().trim();
                a=new Integer(n1);
                b=new Integer(n2);
                int x=a/b;

                Toast.makeText(MainActivity.this, "ans = "+x, Toast.LENGTH_SHORT).show();
            }
        });




    }

}
