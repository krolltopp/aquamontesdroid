package com.aquamontes.android.activety;

import com.aquamontes.R;
import com.aquamontes.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class Main extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		findViewById(R.id.activity_simple_launch_button).setOnClickListener(this);
		findViewById(R.id.activity_2d_launch_button).setOnClickListener(this);
		findViewById(R.id.activity_storage_launch_button).setOnClickListener(this);
		findViewById(R.id.activity_web_launch_button).setOnClickListener(this);
		findViewById(R.id.activity_async_launch_button).setOnClickListener(this);
		findViewById(R.id.about_button).setOnClickListener(this);
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		setContentView(R.layout.main);
		super.onConfigurationChanged(newConfig);
	}
	
	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.activity_simple_launch_button:
			startActivity(new Intent(this,Simple.class));
			break;
		case R.id.about_button:
			startActivity(new Intent(this,About.class));
			break;

		default:
			break;
		}
	}
}
