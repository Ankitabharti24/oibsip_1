package com.example.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editext;
    private Button kg_gm,gm_kg,m_cm,cm_m,submit;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editext=findViewById(R.id.editTextNumberDecimal);
        text=findViewById(R.id.textView);
        kg_gm=findViewById(R.id.button3);
        gm_kg=findViewById(R.id.button4);
        m_cm=findViewById(R.id.button2);
        cm_m=findViewById(R.id.button);
        submit=findViewById(R.id.button5);

    }
    public int a;
    public void submit(View view)
    {
        if(a==1)
        {
            String s=editext.getText().toString();
            Double v=Double.parseDouble(s);
            double ans=v/100;
            text.setText("Converted centimetre to metre:- "+ans);
        }
        else if(a==2)
        {
            String s=editext.getText().toString();
            Integer v=Integer.parseInt(s);
            double ans=v*100;
            text.setText("Converted metre to centimetre:- "+ans);
        }
        else if(a==3)
        {
            String s=editext.getText().toString();
            Integer v=Integer.parseInt(s);
            double ans=v*1000;
            text.setText("Converted kilogram to gram:- "+ans);
        }
        else if(a==4)
        {
            String s=editext.getText().toString();
            Double v=Double.parseDouble(s);
            double ans=v/1000;
            text.setText("Converted gram to kilogram:- "+ans);
        }
    }


    public int kg_gm(View view)
    {
        a=3;
        return a;
    }
    public int gm_kg(View view)
    {
        a=4;
        return a;
    }

    public int cm_m(View view)
    {
        a=1;
        return a;
    }
    public int m_cm(View view)
    {
        a=2;
        return a;
    }

}