package com.android.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetCheckReceiver extends BroadcastReceiver {
	private static final String netACTION = "android.net.conn.CONNECTIVITY_CHANGE";

	@Override
	public void onReceive(Context context, Intent intent) {
		ConnectivityManager connectivityManager = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo mobNetInfo = connectivityManager
				.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
		NetworkInfo wifiNetInfo = connectivityManager
				.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
		if (!mobNetInfo.isConnected() && !wifiNetInfo.isConnected()) {
			Toast.makeText(context, "�������", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(context, "����������", Toast.LENGTH_SHORT).show();
		}
//		if (intent.getAction().equals(netACTION)) {
//
//			// true ��������Ͽ� false ��������û�жϿ�
//			boolean isBreak = intent.getBooleanExtra(
//					ConnectivityManager.EXTRA_NO_CONNECTIVITY, false);
//			if (isBreak) {
//				Toast.makeText(context, "��������", Toast.LENGTH_SHORT).show();
//			} else {
//				Toast.makeText(context, "����û������", Toast.LENGTH_SHORT).show();
//			}
//
//		}

	}

}
