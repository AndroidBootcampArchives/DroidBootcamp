package com.droid.bootcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {

  private static final int REQUEST_CODE_FOR_SUBTRACTION = 1;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void add(View view) {
    int firstNumber = Integer.parseInt(((EditText) findViewById(R.id.number_input_one)).getText().toString());
    int secondNumber = Integer.parseInt(((EditText) findViewById(R.id.number_input_two)).getText().toString());
    int result = firstNumber + secondNumber;
    Intent intent = new Intent(this, ResultActivity.class);
    intent.putExtra(AppConstants.ADDITION_RESULT, result);
    startActivityForResult(intent, REQUEST_CODE_FOR_SUBTRACTION);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    if(resultCode == RESULT_OK){
      int result = data.getIntExtra(AppConstants.SUBTRACTION_RESULT, 0);
      ((TextView)findViewById(R.id.result)).setText(String.valueOf(result));
    }
    super.onActivityResult(requestCode, resultCode, data);
  }
}
