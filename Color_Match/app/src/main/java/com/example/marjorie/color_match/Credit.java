package com.example.marjorie.color_match;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Credit extends AppCompatActivity {

	private CreditView mCreditView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
						WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.credit);
		mCreditView = (CreditView) findViewById(R.id.CreditView);
		mCreditView.setVisibility(View.VISIBLE);
	}
}
