package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {

    String text="Hello World!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void ButtonPress(View view) {
        //value in the text field
        EditText enter = (EditText)findViewById(R.id.editText);

        TextView display = (TextView)enter;

        if((display.getText().length()>=8) && !(display.getText()=="password")) {
            ((TextView) findViewById(R.id.helloText)).setText("acceptable");
        }
        else{
            ((TextView) findViewById(R.id.helloText)).setText("unacceptable");
        }

    }

}
