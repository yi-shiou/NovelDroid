package com.sh1r0.noveldroid;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

public class SettingsActivity extends ActionBarActivity {
	private static final int contentViewCompatID = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
			? android.R.id.content : R.id.action_bar_activity_content;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		getSupportFragmentManager().beginTransaction().replace(contentViewCompatID, new SettingsFragment()).commit();
	}
}
