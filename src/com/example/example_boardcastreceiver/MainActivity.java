package com.example.example_boardcastreceiver;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	Receiver1 receiver;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		IntentFilter filter = new IntentFilter("com.qf.rc");
		receiver = new Receiver1();
		Intent intent = registerReceiver(receiver, filter);
	}
	public void btnClick(View view){
		Intent intentReceiver = new Intent();
		intentReceiver.setAction("com.qf.rc");
		sendBroadcast(intentReceiver);
	}
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		unregisterReceiver(receiver);//全局变量
	}
}
