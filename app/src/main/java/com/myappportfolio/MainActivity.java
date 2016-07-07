package com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This will be responsible for handling a click of the button
     * @param view
     */
    public void onButtonClick(View view) {

        if (view instanceof Button) {
            Button button = (Button) view;
            Toast.makeText(getApplicationContext(), "This button will launch my " + button.getText() + " app", Toast.LENGTH_SHORT).show();
        }

    }
}
