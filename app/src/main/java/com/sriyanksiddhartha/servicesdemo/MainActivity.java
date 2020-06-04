package com.sriyanksiddhartha.servicesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *
 * 	Author: Sriyank Siddhartha
 *
 * 	Module 3: "Working with Started Service"
 *
 * 			"AFTER" project
 * */
public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void startStartedService(View view) {

		Intent intent = new Intent(MainActivity.this, MyStartedService.class);
		startService(intent);
	}

	public void stopStartedService(View view) {

		Intent intent = new Intent(MainActivity.this, MyStartedService.class);
		stopService(intent);
	}
}
