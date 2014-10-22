package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.R;

/**
 * Created by baptiste on 22/10/14.
 */
public class HelloActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        setTitle("Hello");

        Intent i = getIntent();
        String login = i.getStringExtra(MainActivity.EXTRA_LOGIN);

        ((TextView)findViewById(R.id.hello)).setText("Hello " + login + ".");
    }
}
