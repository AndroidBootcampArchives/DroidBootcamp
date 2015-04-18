package com.droid.bootcamp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.result_activity);
    int result = getIntent().getIntExtra(AppConstants.ADDITION_RESULT, 0);
    ((TextView) findViewById(R.id.result)).setText(String.valueOf(result));
  }
}
