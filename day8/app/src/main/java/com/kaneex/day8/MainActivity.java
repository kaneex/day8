package com.kaneex.day8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText one,two,three;
    Button button,button2,button3;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       one=(EditText)findViewById(R.id.one);
        two=(EditText)findViewById(R.id.two);
        three=(EditText)findViewById(R.id.three);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent=new Intent(MainActivity.this,newact.class);
                intent.putExtra("str",one.getText().toString());
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2=new Intent(MainActivity.this,newact.class);
                intent2.putExtra("str",two.getText().toString());
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3=new Intent(MainActivity.this,newact.class);
                intent3.putExtra("str",three.getText().toString());
                startActivity(intent3);
                break;
        }
    }
}
