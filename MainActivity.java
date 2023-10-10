package com.example.sjcet.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }
    public void click(View view){
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
        {
            Toast.makeText(this, "valid", Toast.LENGTH_SHORT).show();
        }

    }
}
