package com.android.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SdCardReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent.getAction().equals("android.intent.action.MEDIA_MOUNTED")) {
			Toast.makeText(context, "SD���Ѿ�����", Toast.LENGTH_SHORT).show();
		} else if (intent.getAction().equals(
				"android.intent.action.MEDIA_REMOVED")
				|| intent.getAction().equals(
						"android.intent.action.ACTION_MEDIA_UNMOUNTED")
				|| intent.getAction().equals(
						"android.intent.action.ACTION_MEDIA_BAD_REMOVAL")) {
			Toast.makeText(context, "����δ����sd��", Toast.LENGTH_SHORT).show();
		}
	}
}
