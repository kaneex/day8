package com.kaneex.day8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class newact extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newact);
        textView=(TextView)findViewById(R.id.textView);
        textView.setText(getIntent().getExtras().getString("str"));
    }
}
