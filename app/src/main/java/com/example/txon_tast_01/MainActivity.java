package com.example.txon_tast_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
   public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextTextPersonName2);
        textView=findViewById(R.id.textView);





    }
   public void cm(View view)
    {
        textView=findViewById(R.id.textView);
        String value=editText.getText().toString();
        double val=Double.parseDouble(value);
        double ans=val*100;
      //  Toast.makeText(this, "hey", Toast.LENGTH_SHORT).show();
        textView.setText(ans+"cm");

    }
    public void kilo(View view)
    {
        textView=findViewById(R.id.textView);
        String value=editText.getText().toString();
        double val=Double.parseDouble(value);
        double ans=val*0.001;
        //  Toast.makeText(this, "hey", Toast.LENGTH_SHORT).show();
        textView.setText(ans+"km");

    }
    public void miles(View view)
    {
        textView=findViewById(R.id.textView);
        String value=editText.getText().toString();
        double val=Double.parseDouble(value);
        double ans=val*0.000621;
        //  Toast.makeText(this, "hey", Toast.LENGTH_SHORT).show();
        textView.setText(ans+"mile");

    }
    public void mili(View view)
    {
        textView=findViewById(R.id.textView);
        String value=editText.getText().toString();
        double val=Double.parseDouble(value);
        double ans=val*1000;
        //  Toast.makeText(this, "hey", Toast.LENGTH_SHORT).show();
        textView.setText(ans+"mile");

    }


}