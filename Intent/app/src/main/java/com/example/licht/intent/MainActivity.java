package com.example.licht.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button=(Button)findViewById(R.id.button01);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View b){
                Intent I=new Intent(Intent.ACTION_DIAL,Uri.parse("tel://554"));
                startActivity(I);
            }
        }
        );
    }
}
