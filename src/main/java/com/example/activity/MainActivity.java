package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.R;

public class MainActivity extends Activity {
    public static final String EXTRA_LOGIN = "Login";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    setTitle("Login");

    ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            String login = ((EditText)findViewById(R.id.login)).getText().toString();
            String password = ((EditText)findViewById(R.id.password)).getText().toString();
            if (login.equals("toto") && password.equals("toto")) {
                Intent i = new Intent(MainActivity.this, HelloActivity.class);
                i.putExtra(EXTRA_LOGIN, login);
                startActivity(i);
            } else {
                ((TextView)findViewById(R.id.error)).setText("Login error");
            }
        }
    });

  }
}
