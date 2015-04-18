package com.droid.bootcamp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

  private int result = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.result_activity);
    findViewById(R.id.subtract_button).setOnClickListener(getOnClickListener());
    result = getIntent().getIntExtra(AppConstants.ADDITION_RESULT, 0);
    ((TextView) findViewById(R.id.result)).setText(String.valueOf(result));
  }

  private View.OnClickListener getOnClickListener() {
    return new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int numberToSubtract = Integer.parseInt(((EditText) findViewById(R.id.number_to_subtract)).getText().toString());
        setResult(RESULT_OK, new Intent().putExtra(AppConstants.SUBTRACTION_RESULT, result - numberToSubtract));
        finish();
      }
    };
  }
}
