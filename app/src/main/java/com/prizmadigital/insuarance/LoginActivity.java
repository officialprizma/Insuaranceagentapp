package com.prizmadigital.insuarance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
 Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       button = (Button) findViewById(R.id.loginbutton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, Mainactivity.class);
                startActivity(i);
            }  });

}
}

