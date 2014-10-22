package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import com.example.R;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @org.junit.Test
    public void titleIsCorrect() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

        assertTrue(activity.getTitle().toString().equals("Login"));
    }

    @org.junit.Test
    public void loginEmptyError() {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.button).performClick();

        assertTrue(((TextView) activity.findViewById(R.id.error)).getText().toString().
                equals("Login error"));
    }

    @org.junit.Test
    public void loginError() {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        ((EditText)activity.findViewById(R.id.login)).setText("tata");
        ((EditText)activity.findViewById(R.id.password)).setText("tata");
        activity.findViewById(R.id.button).performClick();

        assertTrue(((TextView) activity.findViewById(R.id.error)).getText().toString().
                equals("Login error"));

        ((EditText)activity.findViewById(R.id.login)).setText("toto");
        ((EditText)activity.findViewById(R.id.password)).setText("tata");
        activity.findViewById(R.id.button).performClick();

        assertTrue(((TextView) activity.findViewById(R.id.error)).getText().toString().
                equals("Login error"));
    }

    @org.junit.Test
    public void loginSuccess() {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        ((EditText)activity.findViewById(R.id.login)).setText("toto");
        ((EditText)activity.findViewById(R.id.password)).setText("toto");
        activity.findViewById(R.id.button).performClick();

        assertTrue(((TextView) activity.findViewById(R.id.error)).getText().toString().equals(""));

        Intent i = new Intent(activity, HelloActivity.class);
        i.putExtra(MainActivity.EXTRA_LOGIN, "toto");
        assertThat(Robolectric.shadowOf(activity).getNextStartedActivity(),
                CoreMatchers.is(i));

        Activity activity2 = Robolectric.buildActivity(HelloActivity.class).
                withIntent(i).create().get();
        assertTrue(((TextView)activity2.findViewById(R.id.hello)).getText().toString()
                .equals("Hello toto."));
    }
}
