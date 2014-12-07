package com.example.example_boardcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver1 extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		intent.getAction();
		Toast.makeText(context, "Receiver1"+intent.getAction(), 0).show();
	}
}
