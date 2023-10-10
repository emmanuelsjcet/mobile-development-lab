package com.example.sjcet.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(View view) {

        EditText t1=(EditText)findViewById(R.id.editText);
        EditText t2=(EditText)findViewById(R.id.editText2);

        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        int z=x+y;

        TextView tv1=(TextView)findViewById(R.id.tv);
        tv1.setText("sum is "+z);
    }

    public void mult(View view) {

        EditText t1=(EditText)findViewById(R.id.editText);
        EditText t2=(EditText)findViewById(R.id.editText2);

        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        int m=x*y;

        TextView tv1=(TextView)findViewById(R.id.tv);
        tv1.setText("sum is "+m);
    }

    public void div(View view) {

        EditText t1=(EditText)findViewById(R.id.editText);
        EditText t2=(EditText)findViewById(R.id.editText2);

        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        int d=x/y;

        TextView tv1=(TextView)findViewById(R.id.tv);
        tv1.setText("sum is "+d);

    }

    public void sub(View view) {
        EditText t1=(EditText)findViewById(R.id.editText);
        EditText t2=(EditText)findViewById(R.id.editText2);

        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        int s=x/y;

        TextView tv1=(TextView)findViewById(R.id.tv);
        tv1.setText("sum is "+s);
    }
}
