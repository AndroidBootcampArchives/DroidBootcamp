package com.droid.bootcamp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void add(View view) {
    int firstNumber = Integer.parseInt(((EditText) findViewById(R.id.number_input_one)).getText().toString());
    int secondNumber = Integer.parseInt(((EditText) findViewById(R.id.number_input_two)).getText().toString());
    int result = firstNumber + secondNumber;
    TextView resultView = (TextView) findViewById(R.id.result);
    resultView.setText(String.valueOf(result));
  }
}
