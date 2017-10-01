package com.example.kerbe.tacksa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText login_et, password_et;
    Button login_b;
    String[] f, t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_b = (Button) findViewById(R.id.login_b);
        login_et = (EditText) findViewById(R.id.login_et);
        password_et = (EditText) findViewById(R.id.password_et);
        Intent inten = getIntent();
        f = inten.getStringArrayExtra("from");
        t = inten.getStringArrayExtra("to");
        login_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l, p;
                l = login_et.getText().toString();
                p = password_et.getText().toString();
                if(login_et.getText().toString().equals("abc") && password_et.getText().toString().equals("123")){
                    Intent in = new Intent(LoginActivity.this, AdminActivity.class);
                    in.putExtra("from", f);
                    in.putExtra("to", t);
                    startActivity(in);
                }
                else {
                    Toast.makeText(getBaseContext(), "не правильный логин или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
