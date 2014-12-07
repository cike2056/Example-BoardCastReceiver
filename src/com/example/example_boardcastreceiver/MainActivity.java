package com.example.example_boardcastreceiver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void btnClick(View view){
		Intent intent = new Intent("com.qf.receiver1", null);
		Intent intent2 = new Intent("com.qf.receiver2",null);
		sendBroadcast(intent2);
		sendBroadcast(intent);
	}
}
