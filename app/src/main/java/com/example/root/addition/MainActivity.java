package com.example.root.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText firstnumber;
    EditText secondnumber;
    TextView result;
    Button add,sub,mul,div;
    double num1,num2,sum,subtract,multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber =(EditText)findViewById(R.id.tvfirstnumber);
        secondnumber =(EditText)findViewById(R.id.tvsecondnumber);
        result =(TextView)findViewById(R.id.tvresult);
        add= (Button)findViewById(R.id.btadd);
        sub=(Button)findViewById(R.id.btsub);
        mul=(Button)findViewById(R.id.btmul);
        div =(Button)findViewById(R.id.btdiv);

    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1 = Double.parseDouble(firstnumber.getText().toString());
            num2 = Double.parseDouble(secondnumber.getText().toString());
            sum =  num1+num2;
            result.setText(Double.toString(sum));
        }
    });
    sub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1 = Double.parseDouble(firstnumber.getText().toString());
            num2 = Double.parseDouble(secondnumber.getText().toString());
            subtract =  num1-num2;
            result.setText(Double.toString(subtract));

        }
    });
    mul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1 = Double.parseDouble(firstnumber.getText().toString());
            num2 = Double.parseDouble(secondnumber.getText().toString());
            multiply =  num1*num2;
            result.setText(Double.toString(multiply));

        }
    });

    div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1 = Double.parseDouble(firstnumber.getText().toString());
            num2 = Double.parseDouble(secondnumber.getText().toString());
            divide=  num1/num2;
            result.setText(Double.toString(divide));

        }
    });
    }
}
