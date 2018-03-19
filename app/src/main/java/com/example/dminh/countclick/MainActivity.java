package com.example.dminh.countclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtview;
    Button buttonclick;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        txtview = (TextView)findViewById(R.id.txtview);
        buttonclick = (Button)findViewById(R.id.buttonclick);

        buttonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                txtview.setText(String.valueOf(a));
            }
        });
    }
}
